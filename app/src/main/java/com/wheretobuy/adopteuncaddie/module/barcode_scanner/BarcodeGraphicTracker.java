/*
 * Copyright (C) The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wheretobuy.adopteuncaddie.module.barcode_scanner;

import android.util.Log;
import android.util.SparseArray;


import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.barcode.Barcode;
import com.wheretobuy.adopteuncaddie.module.barcode_scanner.BarcodeGraphic;
import com.wheretobuy.adopteuncaddie.module.barcode_scanner.GraphicOverlay;

import java.util.ArrayList;
import java.util.List;

import timber.log.Timber;

//import android.support.annotation.UiThread;
//import com.google.android.gms.samples.vision.barcodereader.ui.camera.GraphicOverlay;

/**
 * Generic tracker which is used for tracking or reading a barcode (and can really be used for
 * any type of item).  This is used to receive newly detected items, add a graphical representation
 * to an overlay, update the graphics as the item changes, and remove the graphics when the item
 * goes away.
 */
public class BarcodeGraphicTracker extends Tracker<Barcode> {
    private GraphicOverlay<BarcodeGraphic> mOverlay;
    private BarcodeGraphic mGraphic;
    private BarcodeGraphicTrackerListener listener;
//    private BarcodeUpdateListener mBarcodeUpdateListener;

    BarcodeGraphicTracker(GraphicOverlay<BarcodeGraphic> overlay, BarcodeGraphic graphic, BarcodeGraphicTrackerListener listener) {
        mOverlay = overlay;
        mGraphic = graphic;
        this.listener = listener;
    }

    /**
     * Start tracking the detected item instance within the item overlay.
     */
    @Override
    public void onNewItem(int id, Barcode item) {
        mGraphic.setId(id);
        Timber.e("barcode detected: %s, listener: %s", item.displayValue, listener);

        if (listener != null) {
            listener.onScanned(item);
        }
    }

    /**
     * Update the position/characteristics of the item within the overlay.
     */
    @Override
    public void onUpdate(Detector.Detections<Barcode> detectionResults, Barcode item) {
        mOverlay.add(mGraphic);
        mGraphic.updateItem(item);

        if (detectionResults != null && detectionResults.getDetectedItems().size() > 1) {
            Timber.e("Multiple items detected");
            Timber.e("onUpdate: %s", detectionResults.getDetectedItems().size());

            if (listener != null) {
                List<Barcode> barcodes = asList(detectionResults.getDetectedItems());
                listener.onScannedMultiple(barcodes);
            }
        }
    }

    public static <C> List<C> asList(SparseArray<C> sparseArray) {
        if (sparseArray == null) return null;
        List<C> arrayList = new ArrayList<C>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++)
            arrayList.add(sparseArray.valueAt(i));
        return arrayList;
    }

    /**
     * Hide the graphic when the corresponding object was not detected.  This can happen for
     * intermediate frames temporarily, for example if the object was momentarily blocked from
     * view.
     */
    @Override
    public void onMissing(Detector.Detections<Barcode> detectionResults) {
        mOverlay.remove(mGraphic);
    }

    /**
     * Called when the item is assumed to be gone for good. Remove the graphic annotation from
     * the overlay.
     */
    @Override
    public void onDone() {
        mOverlay.remove(mGraphic);
    }

    public interface BarcodeGraphicTrackerListener {
        void onScanned(Barcode barcode);

        void onScannedMultiple(List<Barcode> barcodes);

        void onBitmapScanned(SparseArray<Barcode> sparseArray);

        void onScanError(String errorMessage);
    }




//    /**
//     * Consume the item instance detected from an Activity or Fragment level by implementing the
//     * BarcodeUpdateListener interface method onBarcodeDetected.
//     */
//    public interface BarcodeUpdateListener {
//        @UiThread
//        void onBarcodeDetected(Barcode barcode);
//    }
//
//    BarcodeGraphicTracker(GraphicOverlay<BarcodeGraphic> mOverlay, BarcodeGraphic mGraphic,
//                          Context context) {
//        this.mOverlay = mOverlay;
//        this.mGraphic = mGraphic;
//        if (context instanceof BarcodeUpdateListener) {
//            this.mBarcodeUpdateListener = (BarcodeUpdateListener) context;
//        } else {
//            throw new RuntimeException("Hosting activity must implement BarcodeUpdateListener");
//        }
//    }
//
//    /**
//     * Start tracking the detected item instance within the item overlay.
//     */
//    @Override
//    public void onNewItem(int id, Barcode item) {
//        mGraphic.setId(id);
//        mBarcodeUpdateListener.onBarcodeDetected(item);
//    }
//
//    /**
//     * Update the position/characteristics of the item within the overlay.
//     */
//    @Override
//    public void onUpdate(Detector.Detections<Barcode> detectionResults, Barcode item) {
//        mOverlay.add(mGraphic);
//        mGraphic.updateItem(item);
//    }
//
//    /**
//     * Hide the graphic when the corresponding object was not detected.  This can happen for
//     * intermediate frames temporarily, for example if the object was momentarily blocked from
//     * view.
//     */
//    @Override
//    public void onMissing(Detector.Detections<Barcode> detectionResults) {
//        mOverlay.remove(mGraphic);
//    }
//
//    /**
//     * Called when the item is assumed to be gone for good. Remove the graphic annotation from
//     * the overlay.
//     */
//    @Override
//    public void onDone() {
//        mOverlay.remove(mGraphic);
//    }
//
//    public interface BarcodeGraphicTrackerListener {
//        void onScanned(Barcode barcode);
//
//        void onScannedMultiple(List<Barcode> barcodes);
//
//        void onBitmapScanned(SparseArray<Barcode> sparseArray);
//
//        void onScanError(String errorMessage);
//    }
}

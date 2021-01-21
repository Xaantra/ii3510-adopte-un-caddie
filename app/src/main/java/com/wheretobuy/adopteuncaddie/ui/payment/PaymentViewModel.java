package com.wheretobuy.adopteuncaddie.ui.payment;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.wheretobuy.adopteuncaddie.ui.basket.Article;

import java.util.ArrayList;

public class PaymentViewModel extends AndroidViewModel {
    private MutableLiveData<String> mText;
    public SharedPreferences basketList;
    public SharedPreferences cbList;
    private MutableLiveData<ArrayList<Article>> articlesArrayList;
    public ArrayList<String> cbArrayList;

    public ArrayList<String> getGetCbArrayList() { return cbArrayList; }
    public MutableLiveData<ArrayList<Article>> getArticlesArrayList() {
        return articlesArrayList;
    }


    public PaymentViewModel(Application app) {
        super(app);
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
        articlesArrayList = new MutableLiveData<>();
        articlesArrayList.setValue(new ArrayList<Article>());
        cbArrayList = new ArrayList<>();
        basketList = getApplication().getSharedPreferences("Articles", Context.MODE_PRIVATE);
        cbList = getApplication().getSharedPreferences("CB", Context.MODE_PRIVATE);
    }

    public LiveData<String> getText() { return mText; }

    private void saveCB() {
        SharedPreferences.Editor prefsEditor = cbList.edit();
        String json = new Gson().toJson(getGetCbArrayList());
        prefsEditor.putString("CB", json);
        prefsEditor.apply();
    }

}

package com.wheretobuy.adopteuncaddie.model.openfoodfacts;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.wheretobuy.adopteuncaddie.R;

import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import timber.log.Timber;

//import openfoodfacts.github.scrachx.openfood.R;
//import openfoodfacts.github.scrachx.openfood.network.ApiFields;
//import openfoodfacts.github.scrachx.openfood.utils.Modifier;
//import openfoodfacts.github.scrachx.openfood.utils.UnitUtils;
//import openfoodfacts.github.scrachx.openfood.utils.Utils;
//
//import static openfoodfacts.github.scrachx.openfood.utils.Utils.getRoundNumber;

/**
 * JSON representation of the product nutriments entry
 *
 * @see <a href="http://en.wiki.openfoodfacts.org/API#JSON_interface">JSON Structure</a>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Nutriments implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String DEFAULT_UNIT = "g";
    public static final String ENERGY_KCAL = "energy-kcal";
    public static final String ENERGY_KJ = "energy-kj";
    public static final String ENERGY_FROM_FAT = "energy-from-fat";
    public static final String FAT = "fat";
    public static final String SATURATED_FAT = "saturated-fat";
    public static final String BUTYRIC_ACID = "butyric-acid";
    public static final String CAPROIC_ACID = "caproic-acid";
    public static final String CAPRYLIC_ACID = "caprylic-acid";
    public static final String CAPRIC_ACID = "capric-acid";
    public static final String LAURIC_ACID = "lauric-acid";
    public static final String MYRISTIC_ACID = "myristic-acid";
    public static final String PALMITIC_ACID = "palmitic-acid";
    public static final String STEARIC_ACID = "stearic-acid";
    public static final String ARACHIDIC_ACID = "arachidic-acid";
    public static final String BEHENIC_ACID = "behenic-acid";
    public static final String LIGNOCERIC_ACID = "lignoceric-acid";
    public static final String CEROTIC_ACID = "cerotic-acid";
    public static final String MONTANIC_ACID = "montanic-acid";
    public static final String MELISSIC_ACID = "melissic-acid";
    public static final String MONOUNSATURATED_FAT = "monounsaturated-fat";
    public static final String POLYUNSATURATED_FAT = "polyunsaturated-fat";
    public static final String OMEGA_3_FAT = "omega-3-fat";
    public static final String ALPHA_LINOLENIC_ACID = "alpha-linolenic-acid";
    public static final String EICOSAPENTAENOIC_ACID = "eicosapentaenoic-acid";
    public static final String DOCOSAHEXAENOIC_ACID = "docosahexaenoic-acid";
    public static final String OMEGA_6_FAT = "omega-6-fat";
    public static final String LINOLEIC_ACID = "linoleic-acid";
    public static final String ARACHIDONIC_ACID = "arachidonic-acid";
    public static final String GAMMA_LINOLENIC_ACID = "gamma-linolenic-acid";
    public static final String DIHOMO_GAMMA_LINOLENIC_ACID = "dihomo-gamma-linolenic-acid";
    public static final String OMEGA_9_FAT = "omega-9-fat";
    public static final String OLEIC_ACID = "oleic-acid";
    public static final String ELAIDIC_ACID = "elaidic-acid";
    public static final String GONDOIC_ACID = "gondoic-acid";
    public static final String MEAD_ACID = "mead-acid";
    public static final String ERUCIC_ACID = "erucic-acid";
    public static final String NERVONIC_ACID = "nervonic-acid";
    public static final String TRANS_FAT = "trans-fat";
    public static final String CHOLESTEROL = "cholesterol";
    public static final String CARBOHYDRATES = "carbohydrates";
    public static final String SUGARS = "sugars";
    public static final String SUCROSE = "sucrose";
    public static final String GLUCOSE = "glucose";
    public static final String FRUCTOSE = "fructose";
    public static final String LACTOSE = "lactose";
    public static final String MALTOSE = "maltose";
    public static final String MALTODEXTRINS = "maltodextrins";
    public static final String STARCH = "starch";
    public static final String POLYOLS = "polyols";
    public static final String FIBER = "fiber";
    public static final String PROTEINS = "proteins";
    public static final String CASEIN = "casein";
    public static final String SERUM_PROTEINS = "serum-proteins";
    public static final String NUCLEOTIDES = "nucleotides";
    public static final String SALT = "salt";
    public static final String SODIUM = "sodium";
    public static final String ALCOHOL = "alcohol";
    public static final String VITAMIN_A = "vitamin-a";
    public static final String BETA_CAROTENE = "beta-carotene";
    public static final String VITAMIN_D = "vitamin-d";
    public static final String VITAMIN_E = "vitamin-e";
    public static final String VITAMIN_K = "vitamin-k";
    public static final String VITAMIN_C = "vitamin-c";
    public static final String VITAMIN_B1 = "vitamin-b1";
    public static final String VITAMIN_B2 = "vitamin-b2";
    public static final String VITAMIN_PP = "vitamin-pp";
    public static final String VITAMIN_B6 = "vitamin-b6";
    public static final String VITAMIN_B9 = "vitamin-b9";
    public static final String WATER_HARDNESS = "water-hardness";
    public static final String GLYCEMIC_INDEX = "glycemic-index";
    public static final String NUTRITION_SCORE_UK = "nutrition-score-uk";
    public static final String NUTRITION_SCORE_FR = "nutrition-score-fr";
    public static final String CARBON_FOOTPRINT = "carbon-footprint";
    public static final String CHLOROPHYL = "chlorophyl";
    public static final String COCOA = "cocoa";
    public static final String COLLAGEN_MEAT_PROTEIN_RATIO = "collagen-meat-protein-ratio";
    public static final String FRUITS_VEGETABLES_NUTS = "fruits-vegetables-nuts";
    public static final String PH = "ph";
    public static final String TAURINE = "taurine";
    public static final String CAFFEINE = "caffeine";
    public static final String IODINE = "iodine";
    public static final String MOLYBDENUM = "molybdenum";
    public static final String CHROMIUM = "chromium";
    public static final String SELENIUM = "selenium";
    public static final String FLUORIDE = "fluoride";
    public static final String MANGANESE = "manganese";
    public static final String COPPER = "copper";
    public static final String ZINC = "zinc";
    public static final String VITAMIN_B12 = "vitamin-b12";
    public static final String BIOTIN = "biotin";
    public static final String PANTOTHENIC_ACID = "pantothenic-acid";
    public static final String SILICA = "silica";
    public static final String BICARBONATE = "bicarbonate";
    public static final String POTASSIUM = "potassium";
    public static final String CHLORIDE = "chloride";
    public static final String CALCIUM = "calcium";
    public static final String PHOSPHORUS = "phosphorus";
    public static final String IRON = "iron";
    public static final String MAGNESIUM = "magnesium";
    public static final Map<String, Integer> MINERALS_MAP = new HashMap<>();
    public static final Map<String, Integer> FAT_MAP = new HashMap<>();
    public static final Map<String, Integer> CARBO_MAP = new HashMap<>();
    public static final Map<String, Integer> PROT_MAP = new HashMap<>();
    public static final Map<String, Integer> VITAMINS_MAP = new HashMap<>();

    static {
        MINERALS_MAP.put(Nutriments.SILICA, R.string.silica);
        MINERALS_MAP.put(Nutriments.BICARBONATE, R.string.bicarbonate);
        MINERALS_MAP.put(Nutriments.POTASSIUM, R.string.potassium);
        MINERALS_MAP.put(Nutriments.CHLORIDE, R.string.chloride);
        MINERALS_MAP.put(Nutriments.CALCIUM, R.string.calcium);
        MINERALS_MAP.put(Nutriments.PHOSPHORUS, R.string.phosphorus);
        MINERALS_MAP.put(Nutriments.IRON, R.string.iron);
        MINERALS_MAP.put(Nutriments.MAGNESIUM, R.string.magnesium);
        MINERALS_MAP.put(Nutriments.ZINC, R.string.zinc);
        MINERALS_MAP.put(Nutriments.COPPER, R.string.copper);
        MINERALS_MAP.put(Nutriments.MANGANESE, R.string.manganese);
        MINERALS_MAP.put(Nutriments.FLUORIDE, R.string.fluoride);
        MINERALS_MAP.put(Nutriments.SELENIUM, R.string.selenium);
        MINERALS_MAP.put(Nutriments.CHROMIUM, R.string.chromium);
        MINERALS_MAP.put(Nutriments.MOLYBDENUM, R.string.molybdenum);
        MINERALS_MAP.put(Nutriments.IODINE, R.string.iodine);
        MINERALS_MAP.put(Nutriments.CAFFEINE, R.string.caffeine);
        MINERALS_MAP.put(Nutriments.TAURINE, R.string.taurine);
        MINERALS_MAP.put(Nutriments.PH, R.string.ph);
        MINERALS_MAP.put(Nutriments.FRUITS_VEGETABLES_NUTS, R.string.fruits_vegetables_nuts);
        MINERALS_MAP.put(Nutriments.COLLAGEN_MEAT_PROTEIN_RATIO, R.string.collagen_meat_protein_ratio);
        MINERALS_MAP.put(Nutriments.COCOA, R.string.cocoa);
        MINERALS_MAP.put(Nutriments.CHLOROPHYL, R.string.chlorophyl);

        FAT_MAP.put(Nutriments.SATURATED_FAT, R.string.nutrition_satured_fat);
        FAT_MAP.put(Nutriments.MONOUNSATURATED_FAT, R.string.nutrition_monounsaturatedFat);
        FAT_MAP.put(Nutriments.POLYUNSATURATED_FAT, R.string.nutrition_polyunsaturatedFat);
        FAT_MAP.put(Nutriments.OMEGA_3_FAT, R.string.nutrition_omega3);
        FAT_MAP.put(Nutriments.OMEGA_6_FAT, R.string.nutrition_omega6);
        FAT_MAP.put(Nutriments.OMEGA_9_FAT, R.string.nutrition_omega9);
        FAT_MAP.put(Nutriments.TRANS_FAT, R.string.nutrition_trans_fat);
        FAT_MAP.put(Nutriments.CHOLESTEROL, R.string.nutrition_cholesterol);

        CARBO_MAP.put(Nutriments.SUGARS, R.string.nutrition_sugars);
        CARBO_MAP.put(Nutriments.SUCROSE, R.string.nutrition_sucrose);
        CARBO_MAP.put(Nutriments.GLUCOSE, R.string.nutrition_glucose);
        CARBO_MAP.put(Nutriments.FRUCTOSE, R.string.nutrition_fructose);
        CARBO_MAP.put(Nutriments.LACTOSE, R.string.nutrition_lactose);
        CARBO_MAP.put(Nutriments.MALTOSE, R.string.nutrition_maltose);
        CARBO_MAP.put(Nutriments.MALTODEXTRINS, R.string.nutrition_maltodextrins);

        PROT_MAP.put(Nutriments.CASEIN, R.string.nutrition_casein);
        PROT_MAP.put(Nutriments.SERUM_PROTEINS, R.string.nutrition_serum_proteins);
        PROT_MAP.put(Nutriments.NUCLEOTIDES, R.string.nutrition_nucleotides);

        VITAMINS_MAP.put(Nutriments.VITAMIN_A, R.string.vitamin_a);
        VITAMINS_MAP.put(Nutriments.BETA_CAROTENE, R.string.vitamin_a);
        VITAMINS_MAP.put(Nutriments.VITAMIN_D, R.string.vitamin_d);
        VITAMINS_MAP.put(Nutriments.VITAMIN_E, R.string.vitamin_e);
        VITAMINS_MAP.put(Nutriments.VITAMIN_K, R.string.vitamin_k);
        VITAMINS_MAP.put(Nutriments.VITAMIN_C, R.string.vitamin_c);
        VITAMINS_MAP.put(Nutriments.VITAMIN_B1, R.string.vitamin_b1);
        VITAMINS_MAP.put(Nutriments.VITAMIN_B2, R.string.vitamin_b2);
        VITAMINS_MAP.put(Nutriments.VITAMIN_PP, R.string.vitamin_pp);
        VITAMINS_MAP.put(Nutriments.VITAMIN_B6, R.string.vitamin_b6);
        VITAMINS_MAP.put(Nutriments.VITAMIN_B9, R.string.vitamin_b9);
        VITAMINS_MAP.put(Nutriments.VITAMIN_B12, R.string.vitamin_b12);
        VITAMINS_MAP.put(Nutriments.BIOTIN, R.string.biotin);
        VITAMINS_MAP.put(Nutriments.PANTOTHENIC_ACID, R.string.pantothenic_acid);
    }

    private final Map<String, Object> additionalProperties = new HashMap<>();
    private boolean containsMinerals;
    private boolean containsVitamins;

    @NonNull
    public String getEnergyKjValue(final boolean isDataPerServing) {
        if (isDataPerServing) {
            return this.getServing(ENERGY_KJ);
        } else {
            return this.get100g(ENERGY_KJ);
        }
    }

    @NonNull
    public String getEnergyKcalValue(final boolean isDataPerServing) {
        if (isDataPerServing) {
            return this.getServing(ENERGY_KCAL);
        } else {
            return this.get100g(ENERGY_KCAL);
        }
    }

    @Nullable
    public Nutriment get(@NonNull String nutrimentName) {
        if (nutrimentName.isEmpty() || additionalProperties.get(nutrimentName) == null) {
            return null;
        }

        try {
            return new Nutriment(nutrimentName,
                additionalProperties.get(nutrimentName).toString(),
                get100g(nutrimentName),
                getServing(nutrimentName),
                getUnit(nutrimentName),
                getModifier(nutrimentName));
        } catch (NullPointerException e) {
            // In case one of the getters was unable to get data as string
            Timber.e(e);
            return null;
        }
    }

    /**
     * @param nutrimentName
     * @return {@link StringUtils#EMPTY} if there is no serving value for the specified nutriment
     */
    @NonNull
    public String getServing(String nutrimentName) {
        return getAdditionalProperty(nutrimentName, ApiFields.Suffix.SERVING);
    }

    /**
     * @param nutrimentName
     * @return {@link StringUtils#EMPTY} if there is no serving value for the specified nutriment
     */
    @NonNull
    public String get100g(String nutrimentName) {
        return getAdditionalProperty(nutrimentName, ApiFields.Suffix.VALUE_100G);
    }

    @NonNull
    public String getUnit(String nutrimentName) {
        return getAdditionalProperty(nutrimentName, ApiFields.Suffix.UNIT, DEFAULT_UNIT);
    }

    @NonNull
    public String getModifier(String nutrimentName) {
        return getAdditionalProperty(nutrimentName, ApiFields.Suffix.MODIFIER, Utils.Modifier.DEFAULT_MODIFIER);
    }

//    /**
//     * Get the nutriment modifier if it is different from {@link Modifier#DEFAULT_MODIFIER}
//     *
//     * @param nutrimentName
//     * @return The nutriment modifier if different from {@link Modifier#DEFAULT_MODIFIER}, otherwise an empty string {@code ""}
//     */
    public String getModifierIfNotDefault(String nutrimentName) {
        final String modifier = getModifier(nutrimentName);
        return Utils.getModifierNonDefault(modifier);
    }

    @NonNull
    private String getAdditionalProperty(String nutrimentName, String suffix) {
        return getAdditionalProperty(nutrimentName, suffix, StringUtils.EMPTY);
    }

    @NonNull
    private String getAdditionalProperty(String nutrimentName, String suffix, String defaultValue) {
        final Object value = additionalProperties.get(nutrimentName + suffix);
        return value == null ? defaultValue : value.toString();
    }

    public boolean contains(String nutrimentName) {
        return additionalProperties.containsKey(nutrimentName);
    }

    public boolean hasVitamins() {
        return containsVitamins;
    }

    public boolean hasMinerals() {
        return containsMinerals;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);

        if (VITAMINS_MAP.containsKey(name)) {
            containsVitamins = true;
        } else if (MINERALS_MAP.containsKey(name)) {
            containsMinerals = true;
        }
    }

    public static class Nutriment {
        private final String for100g;
        private final String forServing;
        private final String key;
        @NonNull
        private final String modifier;
        private final String name;
        @NonNull
        private final String unit;

        Nutriment(@NonNull String key, String name, String for100g, String forServing, @NonNull String unit, @NonNull String modifier) {
            this.key = key;
            this.name = name;
            this.for100g = for100g;
            this.forServing = forServing;
            this.modifier = modifier;
            this.unit = getRealUnit(unit);
        }

        @NonNull
        public String getModifier() {
            return modifier;
        }

        public String getDisplayStringFor100g() {
            final StringBuilder builder = new StringBuilder();
            final String mod = Utils.getModifierNonDefault(getModifier());
            if (!mod.equals("")) {
                builder.append(mod).append(" ");
            }
            return builder.append(getFor100gInUnits()).append(" ").append(unit).toString();
        }

        /**
         * All the values given by the api are in gram. For all unit it's possible to convert back to th
         *
         * @param unit the initial unit
         * @return if the unit is % DV, the api gives the value in g
         */
        private String getRealUnit(String unit) {
            if (unit.contains("%")) {
                return Units.UNIT_GRAM;
            }
            return unit;
        }

        public String getName() {
            return name;
        }

        /**
         * Returns the amount of nutriment per 100g
         * of product in the units stored in {@link Nutriment#unit}
         */
        public String getFor100gInUnits() {
            return getValueInUnits(for100g, unit);
        }

        /**
         * Returns the amount of nutriment per serving
         * of product in the units stored in {@link Nutriment#unit}
         */
        public String getForServingInUnits() {
            return getValueInUnits(forServing, unit);
        }

        public String getUnit() {
            return unit;
        }

        private String getValueInUnits(String valueInGramOrMl, String unit) {
            if (StringUtils.isBlank(valueInGramOrMl)) {
                return StringUtils.EMPTY;
            }
            if (valueInGramOrMl.isEmpty() || unit.equals(Units.UNIT_GRAM)) {
                return valueInGramOrMl;
            }
            float value = Float.parseFloat(valueInGramOrMl);
            value = Units.UnitUtils.convertFromGram(value, unit);
            return Utils.getRoundNumber(value);
        }

        public String getKey() {
            return key;
        }

        /**
         * Calculates the nutriment value for a given amount of this product. For example,
         * calling getForAnyValue(1, "kg") will give you the amount of this nutriment
         * given 1 kg of the product.
         *
         * @param userSetServing amount of this product used to calculate nutriment value
         * @param otherUnit units in either "g", "kg", or "mg" to define userSetServing
         * @return nutriment value for a given amount of this product
         */
        public String getForAnyValue(float userSetServing, String otherUnit) {
            String strValue = getFor100gInUnits();
            if (strValue.isEmpty() || strValue.contains("%")) {
                return strValue;
            }
            try {
                float valueFor100g = Float.parseFloat(strValue);
                float portionInGram = Units.UnitUtils.convertToGrams(userSetServing, otherUnit);
                return Utils.getRoundNumber(valueFor100g / 100 * portionInGram);
            } catch (NumberFormatException fmt) {
                Timber.w(fmt, "getForAnyValue can't parse value %s", strValue);
            }
            return StringUtils.EMPTY;
        }
    }
}

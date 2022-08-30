package com.qaprosoft.carina.demo.mobile.enums;

public enum CreateFoodNutritionFacts {
    CALORIES("editTxtCalories"),
    TOTAL_FAT("editTxtTotalFat"),
    SATURATED_FAT("editTxtSaturatedFat"),
    TRANS_FAT("editTxtTransFat"),
    POLYUNSATURATED_FAT("editTxtPolyunsaturatedFat"),
    MONOUNSATURATED_FAT("editTxtMonounsaturatedFat"),
    CHOLESTEROL("editTxtCholesterol"),
    SODIUM("editTxtSodium"),
    TOTAL_CARBOHYDRATES("editTxtTotalCarbohydrates"),
    DIETARY_FIBERS("editTxtDietaryFibers"),
    SUGARS("editTxtSugars"),
    ADDED_SUGARS("editTxtAddedSugars"),
    SUGAR_ALCOHOLS("editTxtSugarAlcohols"),
    PROTEIN("editTxtProtein"),
    VITAMIN_D("editTxtVitaminD"),
    CALCIUM("editTxtCalcium"),
    IRON("editTxtIron"),
    POTASSIUM("editTxtPotassium"),
    VITAMIN_A("editTxtVitaminA"),
    VITAMIN_C("editTxtVitaminC");

    private String resourceId;

    CreateFoodNutritionFacts(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceId() {
        return resourceId;
    }
}

package com.qaprosoft.carina.demo.mobile.enums;

public enum CreateFoodFields {
    BRAND_NAME("editTxtBrandName"),
    DESCRIPTION("editTxtDescription"),
    SERVING_SIZE("editTxtServingSizeQuantity"),
    SERVING_SIZE_UNITS("servingSizeAutoTxt"),
    SERVING_PER_CONTAINER("editTxtServingsPerContainer");

    private String resourceId;

    CreateFoodFields(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceId() {
        return resourceId;
    }
}

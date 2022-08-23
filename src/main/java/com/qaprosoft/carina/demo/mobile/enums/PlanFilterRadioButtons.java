package com.qaprosoft.carina.demo.mobile.enums;

public enum PlanFilterRadioButtons {
    FREE("Free"),
    MEAL_PLAN("Meal Plan"),
    NUTRITION("Nutrition"),
    WALKING("Walking"),
    WORKOUT("Workout");

    private String buttonText;

    PlanFilterRadioButtons(String buttonText) {
        this.buttonText = buttonText;
    }

    public String getButtonText() {
        return buttonText;
    }
}

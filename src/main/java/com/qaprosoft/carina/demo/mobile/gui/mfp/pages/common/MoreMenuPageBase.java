package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MoreMenuPageBase extends AbstractPage {
    public MoreMenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isOptionPresent(MoreOptions option);

    public enum MoreOptions {
        MY_PREMIUM_TOOLS("My Premium Tools"),
        RECIPE_DISCOVERY("Recipe Discovery"),
        PROGRESS("Progress"),
        WORKOUT_ROUTINE("Workout Routines"),
        GOALS("Goals"),
        NUTRITION("Nutrition"),
        RECIPE_MEALS_FOODS("Recipes, Meals & Foods"),
        APPS_AND_DEVICES("Apps & Devices"),
        STEPS("Steps"),
        COMMUNITY("Community"),
        REMINDERS("Reminders"),
        FRIENDS("Friends"),
        MESSAGES("Messages"),
        PRIVACY_CENTER("Privacy Center"),
        SETTINGS("Settings"),
        HELP("Settings");

        private String optionText;

        MoreOptions(String optionText) {
            this.optionText = optionText;
        }

        public String getOptionText() {
            return optionText;
        }
    }

}

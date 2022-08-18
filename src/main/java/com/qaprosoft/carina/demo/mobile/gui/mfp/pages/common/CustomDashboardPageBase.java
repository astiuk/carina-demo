package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CustomDashboardPageBase extends AbstractPage {

    public CustomDashboardPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase selectCustomDashboard(Options option);

    public enum Options {
        CALORIES_FOCUS("rbCaloriesRem"),
        MACRONUTRIENT_FOCUS("rbMacrosRem"),
        HEART_HEALTHY("rbHeartHealthy"),
        LOW_CARB("rbLowCarb"),
        CUSTOM("rbCustomSummary");

        private String optionId;

        Options(String optionId) {
            this.optionId = optionId;
        }

        public String getOptionId() {
            return optionId;
        }
    }
}

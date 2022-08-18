package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.commons.math3.analysis.function.Abs;
import org.openqa.selenium.WebDriver;

public abstract class CustomDashboardPageBase extends AbstractPage {

    public CustomDashboardPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage selectCustomDashboard(Options option);

    public enum Options {
        CALORIES_FOCUS("rbCaloriesRem", DiaryPageBase.class),
        MACRONUTRIENT_FOCUS("rbMacrosRem", DiaryPageBase.class),
        HEART_HEALTHY("rbHeartHealthy", DiaryPageBase.class),
        LOW_CARB("rbLowCarb", DiaryPageBase.class),
        CUSTOM("rbCustomSummary", CustomSummaryPageBase.class);

        private String optionId;
        private Class<? extends AbstractPage> page;

        Options(String optionId, Class<? extends AbstractPage> page) {
            this.optionId = optionId;
            this.page = page;
        }

        public String getOptionId() {
            return optionId;
        }

        public Class<? extends AbstractPage> getPage() {
            return page;
        }
    }
}

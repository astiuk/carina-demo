package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CustomSummaryPageBase extends AbstractPage {

    public CustomSummaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase clickDoneButton();

    public abstract boolean isNutrientChecked(Nutrients nutrient);

    public enum Nutrients {
        FAT("cbFat"),
        CARBOHYDRATES("cbCarbs"),
        PROTEIN("cbProtein");

        private String nutrientId;

        Nutrients(String nutrientId) {
            this.nutrientId = nutrientId;
        }

        public String getNutrientId() {
            return nutrientId;
        }
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CustomSummaryPageBase extends AbstractPage implements IMobileUtils {

    public CustomSummaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase clickDoneButton();

    public abstract boolean isDoneButtonActive();

    public abstract void checkNutrient(Nutrients nutrient);

    public abstract void uncheckNutrient(Nutrients nutrient);

    public abstract boolean isNutrientChecked(Nutrients nutrient);

    public enum Nutrients {
        FAT("cbFat"),
        SAT_FAT("cbSatFat"),
        POLY_FAT("cbPolyFat"),
        MONO_FAT("cbMonoFat"),
        TRANS_FAT("cbTransFat"),
        CHOLESTEROL("cbCholesterol"),
        SODIUM("cbSodium"),
        POTASSIUM("cbPotassium"),
        CARBOHYDRATES("cbCarbs"),
        FIBER("cbFiber"),
        SUGAR("cbSugar"),
        PROTEIN("cbProtein"),
        VITAMIN_A("cbVitaminA"),
        VITAMIN_C("cbVitaminC"),
        CALCIUM("cbCalcium"),
        IRON("cbIron");

        private String nutrientId;

        Nutrients(String nutrientId) {
            this.nutrientId = nutrientId;
        }

        public String getNutrientId() {
            return nutrientId;
        }
    }
}

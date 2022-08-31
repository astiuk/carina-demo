package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.CreateFoodNutritionFacts;
import org.openqa.selenium.WebDriver;

public abstract class CreateFoodPageBase extends AbstractPage {

    public CreateFoodPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void fillAllFields(String brandName,
                                       String description,
                                       int servingSize,
                                       String servingSizeUnits,
                                       int servingsPerContainer);

    public abstract void clickNextButton();

    public abstract void typeNutritionFact(CreateFoodNutritionFacts nutritionFact, double value);

    public abstract void clickSaveButton();

    public abstract void clickNoThanksButton();
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.enums.CreateFoodNutritionFacts;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CreateFoodPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CreateFoodPageBase.class)
public class CreateFoodPage extends CreateFoodPageBase {

    public CreateFoodPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void fillAllFields(String brandName, String description, int servingSize, String servingSizeUnits, int servingsPerContainer) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickNextButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void typeNutritionFact(CreateFoodNutritionFacts nutritionFact, double value) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickSaveButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickNoThanksButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

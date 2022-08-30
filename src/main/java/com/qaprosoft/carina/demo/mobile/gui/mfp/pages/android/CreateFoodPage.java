package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.enums.CreateFoodFields;
import com.qaprosoft.carina.demo.mobile.enums.CreateFoodNutritionFacts;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CreateFoodPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateFoodPageBase.class)
public class CreateFoodPage extends CreateFoodPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/%s")
    private ExtendedWebElement field;

    @FindBy(xpath = "//*[@text='Next']")
    private ExtendedWebElement nextButton;

    @FindBy(xpath = "//*[@text='Save']")
    private ExtendedWebElement saveButton;

    @FindBy(xpath = "//*[@text='No Thanks']")
    private ExtendedWebElement noThanksButton;

    public CreateFoodPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void fillAllFields(String brandName,
                              String description,
                              int servingSize,
                              String servingSizeUnits,
                              int servingsPerContainer) {
        field.format(CreateFoodFields.BRAND_NAME.getResourceId()).type(brandName, 3);
        field.format(CreateFoodFields.DESCRIPTION.getResourceId()).type(description, 3);
        field.format(CreateFoodFields.SERVING_SIZE.getResourceId()).type(String.valueOf(servingSize), 3);
        field.format(CreateFoodFields.SERVING_SIZE_UNITS.getResourceId()).type(servingSizeUnits, 3);
        field.format(CreateFoodFields.SERVING_PER_CONTAINER.getResourceId()).type(String.valueOf(servingsPerContainer), 3);
    }

    @Override
    public void clickNextButton() {
        nextButton.click(3);
    }

    @Override
    public void typeNutritionFact(CreateFoodNutritionFacts nutritionFact, double value) {
        field.format(nutritionFact.getResourceId()).type(String.valueOf(value), 3);
    }

    @Override
    public void clickSaveButton() {
        saveButton.click(3);
    }

    @Override
    public void clickNoThanksButton() {
        noThanksButton.click(3);
    }

    @Override
    public boolean isPageOpened() {
        return field.format(CreateFoodFields.BRAND_NAME.getResourceId()).isPresent(3);
    }
}

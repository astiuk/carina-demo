package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase {

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement doneButton;

    @FindBy(id = "com.myfitnesspal.android:id/%s")
    private ExtendedWebElement nutrientCheckbox;

    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase clickDoneButton() {
        doneButton.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }

    @Override
    public boolean isNutrientChecked(Nutrients nutrient) {
        return nutrientCheckbox.format(nutrient.getNutrientId()).isChecked();
    }
}

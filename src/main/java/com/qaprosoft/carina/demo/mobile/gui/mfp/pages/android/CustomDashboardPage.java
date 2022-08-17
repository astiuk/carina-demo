package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CustomDashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CustomDashboardPageBase.class)
public class CustomDashboardPage extends CustomDashboardPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/%s']")
    private ExtendedWebElement optionRadioButton;

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement customSummaryDoneButton;

    public CustomDashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase selectCustomDashboard(Options option) {
        optionRadioButton.format(option.getOptionId()).click(3);
        if(option.equals(Options.CUSTOM)) customSummaryDoneButton.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }
}

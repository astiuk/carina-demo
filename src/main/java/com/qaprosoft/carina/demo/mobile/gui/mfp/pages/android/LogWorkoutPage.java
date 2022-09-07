package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.LogWorkoutPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansTasksPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LogWorkoutPageBase.class)
public class LogWorkoutPage extends LogWorkoutPageBase {

    @ExtendedFindBy(accessibilityId = "Done")
    private ExtendedWebElement checkmarkButton;

    public LogWorkoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PlansTasksPageBase clickCheckmarkButton() {
        checkmarkButton.click(3);
        return initPage(getDriver(), PlansTasksPageBase.class);
    }
}

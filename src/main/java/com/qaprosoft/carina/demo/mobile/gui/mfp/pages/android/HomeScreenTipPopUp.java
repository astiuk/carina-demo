package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomeScreenTipPopUpBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeScreenTipPopUpBase.class)
public class HomeScreenTipPopUp extends HomeScreenTipPopUpBase {

    @FindBy(xpath = "(//android.widget.FrameLayout[@resource-id='android:id/content']//android.widget.Button)[1]")
    private ExtendedWebElement closeButton;

    public HomeScreenTipPopUp(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickCloseButton() {
        closeButton.click();
    }
}

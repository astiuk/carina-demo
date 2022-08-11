package com.qaprosoft.carina.demo.mobile.gui.components.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.components.common.HomeScreenTipPopUpBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeScreenTipPopUpBase.class)
public class HomeScreenTipPopUp extends HomeScreenTipPopUpBase {

    public HomeScreenTipPopUp(WebDriver driver) {
        super(driver);
    }
}

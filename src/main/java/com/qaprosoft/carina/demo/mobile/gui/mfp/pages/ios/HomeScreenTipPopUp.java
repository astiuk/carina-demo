package com.qaprosoft.carina.demo.mobile.gui.components.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.components.common.HomeScreenTipPopUpBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenTipPopUpBase.class)
public class HomeScreenTipPopUp extends HomeScreenTipPopUpBase {

    public HomeScreenTipPopUp(WebDriver driver) {
        super(driver);
    }
}

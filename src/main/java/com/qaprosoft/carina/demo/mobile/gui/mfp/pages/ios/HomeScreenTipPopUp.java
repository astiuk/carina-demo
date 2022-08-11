package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomeScreenTipPopUpBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenTipPopUpBase.class)
public class HomeScreenTipPopUp extends HomeScreenTipPopUpBase {

    public HomeScreenTipPopUp(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickCloseButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

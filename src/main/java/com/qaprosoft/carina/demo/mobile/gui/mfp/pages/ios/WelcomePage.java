package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.WelcomePageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickLoginButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

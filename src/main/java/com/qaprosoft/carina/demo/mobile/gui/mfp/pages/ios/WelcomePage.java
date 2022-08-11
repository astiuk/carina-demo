package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MfpLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MfpWelcomePageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MfpWelcomePageBase.class)
public class MfpWelcomePage extends MfpWelcomePageBase {

    public MfpWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MfpLoginPageBase clickLoginButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

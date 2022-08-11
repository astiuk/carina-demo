package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.UserProfilePageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = UserProfilePageBase.class)
public class UserProfilePage extends UserProfilePageBase {

    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getUserName() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

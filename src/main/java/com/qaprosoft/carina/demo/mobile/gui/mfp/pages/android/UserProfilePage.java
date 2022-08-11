package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.UserProfilePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UserProfilePageBase.class)
public class UserProfilePage extends UserProfilePageBase {

    @FindBy(id = "com.myfitnesspal.android:id/toolbarUsername")
    private ExtendedWebElement userName;

    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getUserName() {
        return userName.getText();
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.UserProfilePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @ExtendedFindBy(accessibilityId = "User avatar")
    private ExtendedWebElement userAvatar;

    @FindBy(xpath = "")
    private ExtendedWebElement userName;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public UserProfilePageBase openUserProfile() {
        userName.click();
        return initPage(getDriver(), UserProfilePageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return userAvatar.isPresent();
    }
}

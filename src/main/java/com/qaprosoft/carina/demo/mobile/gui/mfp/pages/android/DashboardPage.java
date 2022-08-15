package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.UserProfilePageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DashboardPageBase.class)
public class DashboardPage extends DashboardPageBase {

    @ExtendedFindBy(accessibilityId = "User avatar")
    private ExtendedWebElement userAvatar;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public UserProfilePageBase openUserProfile() {
        userAvatar.click();
        return initPage(getDriver(), UserProfilePageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return userAvatar.isPresent();
    }
}

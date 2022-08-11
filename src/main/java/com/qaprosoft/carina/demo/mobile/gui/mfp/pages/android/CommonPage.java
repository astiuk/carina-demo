package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.UserProfilePageBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserLoggedIn(String username) {
        DashboardPageBase homePage = initPage(getDriver(), DashboardPageBase.class);
        UserProfilePageBase userProfilePage = homePage.openUserProfile();
        Assert.assertEquals(userProfilePage.getUserName(), username);
        return true;
    }

}

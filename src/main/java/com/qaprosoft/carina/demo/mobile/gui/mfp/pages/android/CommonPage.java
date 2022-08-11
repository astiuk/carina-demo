package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomeScreenTipPopUpBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.UserProfilePageBase;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserLoggedIn(String username) {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        UserProfilePageBase userProfilePage = homePage.openUserProfile();
        return userProfilePage.getUserName().equals(username);
    }

    @Override
    public void closePopUp() {
        HomeScreenTipPopUpBase homeScreenTipPopUp = initPage(getDriver(), HomeScreenTipPopUpBase.class);
        homeScreenTipPopUp.clickCloseButton();
    }
}

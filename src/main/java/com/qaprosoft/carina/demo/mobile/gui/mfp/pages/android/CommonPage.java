package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.BottomNavigatorButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {

    @ExtendedFindBy(accessibilityId = "Dashboard")
    private ExtendedWebElement dashboardButton;

    @ExtendedFindBy(accessibilityId = "Diary")
    private ExtendedWebElement diaryButton;

    @ExtendedFindBy(accessibilityId = "Newsfeed")
    private ExtendedWebElement newsfeedButton;

    @ExtendedFindBy(accessibilityId = "Plans")
    private ExtendedWebElement plansButton;

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserLoggedIn(String username) {
        DashboardPageBase dashboardPage = initPage(getDriver(), DashboardPageBase.class);
        Assert.assertTrue(dashboardPage.isPageOpened(), "Dashboard page isn't opened");
        return true;
    }

    @Override
    public AbstractPage clickBottomNavigatorButton(BottomNavigatorButtons button) {
        switch (button)
        {
            case DASHBOARD: dashboardButton.click();
                break;
            case DIARY: diaryButton.click();
                break;
            case NEWSFEED: newsfeedButton.click();
                break;
            case PLANS: plansButton.click();
                break;
        }
        return initPage(getDriver(), button.getPage());
    }
}

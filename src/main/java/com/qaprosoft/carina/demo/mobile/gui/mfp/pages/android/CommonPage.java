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

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement navigationButton;

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
        navigationButton.format(button.getOptionAndroid()).click();
        return initPage(getDriver(), button.getPage());
    }
}

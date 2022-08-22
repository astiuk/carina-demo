package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.BottomNavigatorButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement navigationButton;

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement itemByText;

    @FindBy(id = "com.myfitnesspal.android:id/close_btn")
    private ExtendedWebElement closeModalButton;

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

    @Override
    public void clickCloseModalButton() {
        closeModalButton.click(3);
    }

    @Override
    public boolean isItemByTextPresent(String text) {
        return itemByText.format(text).isPresent(3);
    }

    @Override
    public void SwipeToElementByText(String text) {
        swipe(itemByText.format(text), Direction.VERTICAL, 3, 1000);
    }
}

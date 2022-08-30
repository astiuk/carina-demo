package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.UserProfilePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UserProfilePageBase.class)
public class UserProfilePage extends UserProfilePageBase {

    @FindBy(id = "com.myfitnesspal.android:id/toolbarUsername")
    private ExtendedWebElement userName;

    @ExtendedFindBy(accessibilityId = "%s")
    private ExtendedWebElement tabButton;

    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getUserName() {
        return userName.getText();
    }

    @Override
    public AbstractPage openTabPage(TabButtons button) {
        tabButton.format(button.getAccessibilityId()).click(3);
        return initPage(getDriver(), button.getPage());
    }

    @Override
    public boolean isPageOpened() {
        return userName.isPresent(3);
    }
}

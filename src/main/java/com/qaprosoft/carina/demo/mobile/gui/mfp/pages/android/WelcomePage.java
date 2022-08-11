package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.WelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

    @FindBy(id = "com.myfitnesspal.android:id/imageLogo")
    private ExtendedWebElement imageLogo;

    @FindBy(id = "com.myfitnesspal.android:id/buttonSignUp")
    private ExtendedWebElement signUpButton;

    @FindBy(id = "com.myfitnesspal.android:id/buttonLogIn")
    private ExtendedWebElement logInButton;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickLoginButton() {
        logInButton.click();
        return initPage(getDriver(), LoginPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return imageLogo.isPresent();
    }
}

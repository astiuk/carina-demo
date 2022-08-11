package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MfpLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MfpWelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MfpWelcomePageBase.class)
public class MfpWelcomePage extends MfpWelcomePageBase {

    @FindBy(id = "com.myfitnesspal.android:id/imageLogo")
    private ExtendedWebElement imageLogo;

    @FindBy(id = "com.myfitnesspal.android:id/buttonSignUp")
    private ExtendedWebElement signUpButton;

    @FindBy(id = "com.myfitnesspal.android:id/buttonLogIn")
    private ExtendedWebElement logInButton;

    public MfpWelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public MfpLoginPageBase clickLoginButton() {
        logInButton.click();
        return new MfpLoginPage(this.driver);
    }

    @Override
    public boolean isPageOpened() {
        return imageLogo.isPresent();
    }
}

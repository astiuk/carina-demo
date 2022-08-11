package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MfpSignUpPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MfpSignUpPageBase.class)
public class MfpSingUpPage extends MfpSignUpPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/welcome_text_view")
    private ExtendedWebElement welcomeTitle;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement continueButton;

    @FindBy(id = "com.myfitnesspal.android:id/facebook_button")
    private ExtendedWebElement continueFacebookButton;

    @FindBy(id = "com.myfitnesspal.android:id/nextButton")
    private ExtendedWebElement nextButton;

    public MfpSingUpPage(WebDriver driver) {
        super(driver);
    }
}

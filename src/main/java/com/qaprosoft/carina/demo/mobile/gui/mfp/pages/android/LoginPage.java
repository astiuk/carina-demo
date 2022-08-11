package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MfpHomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MfpLoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MfpLoginPageBase.class)
public class MfpLoginPage extends MfpLoginPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/email_address_edit")
    private ExtendedWebElement emailField;

    @FindBy(id = "com.myfitnesspal.android:id/password_edit")
    private ExtendedWebElement passwordField;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement loginButton;

    @FindBy(id = "com.myfitnesspal.android:id/forgot_password_button")
    private ExtendedWebElement forgotPasswordLink;

    @FindBy(id = "com.myfitnesspal.android:id/facebook_button")
    private ExtendedWebElement facebookLoginButton;

    public MfpLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeEmail(String email) {
        emailField.type(email);
    }

    @Override
    public void typePassword(String password) {
        passwordField.type(password);
    }

    @Override
    public String getEmailText() {
        return emailField.getText();
    }

    @Override
    public String getPasswordText() {
        return emailField.getText();
    }

    @Override
    public boolean isEmailFieldPresent() {
        return emailField.isPresent();
    }

    @Override
    public boolean isPasswordFieldPresent() {
        return passwordField.isPresent();
    }

    @Override
    public boolean isLoginButtonPresent() {
        return loginButton.isPresent();
    }

    @Override
    public boolean isForgotPasswordLinkPresent() {
        return forgotPasswordLink.isPresent();
    }

    @Override
    public boolean isFacebookLoginButtonPresent() {
        return facebookLoginButton.isPresent();
    }

    @Override
    public boolean isLoginButtonClickable() {
        return loginButton.isClickable();
    }

    @Override
    public boolean isForgotPasswordLinkClickable() {
        return forgotPasswordLink.isClickable();
    }

    @Override
    public boolean isFacebookLoginButtonClickable() {
        return facebookLoginButton.isClickable();
    }

    @Override
    public boolean isPageOpened() {
        return loginButton.isPresent();
    }

    @Override
    public MfpHomePageBase clickLoginButton() {
        loginButton.click();
        return new MfpHomePage(this.driver);
    }

    //TODO: change void to Page
    @Override
    public void clickForgotPasswordButton() {
        forgotPasswordLink.click();
    }

    //TODO: change void to Page
    @Override
    public void clickFacebookLoginButton() {
        facebookLoginButton.click();
    }
}

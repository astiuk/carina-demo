package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomeScreenModalBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.WelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

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

    public LoginPage(WebDriver driver) {
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
    public DashboardPageBase clickLoginButton() {
        loginButton.click();
        return initPage(getDriver(), DashboardPageBase.class);
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

    @Override
    public DashboardPageBase login(String email, String password) {
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");

        welcomePage.clickLoginButton();
        Assert.assertTrue(isPageOpened(), "Login page isn't opened");

        Assert.assertTrue(isEmailFieldPresent(), "Email field isn't present");
        Assert.assertTrue(isPasswordFieldPresent(), "Password field isn't present");
        Assert.assertTrue(isLoginButtonPresent(), "Login button isn't present");

        typeEmail(email);
        Assert.assertEquals(getEmailText(), R.TESTDATA.get("email"), "Email isn't typed");
        typePassword(password);
        clickLoginButton();
        HomeScreenModalBase homeScreenModal = initPage(getDriver(), HomeScreenModalBase.class);
        homeScreenModal.closeModal();
        DashboardPageBase dashboardPage = initPage(getDriver(), DashboardPageBase.class);
        Assert.assertTrue(dashboardPage.isPageOpened(), "Login failed, Dashboard page isn't opened");
        return dashboardPage;
    }
}

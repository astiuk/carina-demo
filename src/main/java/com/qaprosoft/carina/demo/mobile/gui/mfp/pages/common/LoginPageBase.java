package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MfpHomePageBase;
import org.openqa.selenium.WebDriver;

public abstract class MfpLoginPageBase extends AbstractPage {

    public MfpLoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmail(String email);

    public abstract void typePassword(String password);

    public abstract String getEmailText();

    public abstract String getPasswordText();

    public abstract boolean isEmailFieldPresent();

    public abstract boolean isPasswordFieldPresent();

    public abstract boolean isLoginButtonPresent();

    public abstract boolean isForgotPasswordLinkPresent();

    public abstract boolean isFacebookLoginButtonPresent();

    public abstract boolean isLoginButtonClickable();

    public abstract boolean isForgotPasswordLinkClickable();

    public abstract boolean isFacebookLoginButtonClickable();

    public abstract MfpHomePageBase clickLoginButton();

    //TODO: change void to Page
    public abstract void clickForgotPasswordButton();

    //TODO: change void to Page
    public abstract void clickFacebookLoginButton();
}

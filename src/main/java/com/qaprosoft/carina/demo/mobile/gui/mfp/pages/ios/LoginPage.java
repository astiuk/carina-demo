package com.qaprosoft.carina.demo.mobile.gui.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MfpHomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MfpLoginPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MfpLoginPageBase.class)
public class MfpLoginPage extends MfpLoginPageBase {

    public MfpLoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeEmail(String email) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void typePassword(String password) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public String getEmailText() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public String getPasswordText() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isEmailFieldPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isPasswordFieldPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isLoginButtonPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isForgotPasswordLinkPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isFacebookLoginButtonPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isLoginButtonClickable() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isForgotPasswordLinkClickable() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isFacebookLoginButtonClickable() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public MfpHomePageBase clickLoginButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickForgotPasswordButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickFacebookLoginButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

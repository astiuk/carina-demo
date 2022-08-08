package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @FindBy(xpath = "//android.widget.TextView[@text = 'CARINA']")
    private ExtendedWebElement carinaTitle;

    @FindBy(id = "com.solvd.carinademoapplication:id/name")
    private ExtendedWebElement nameInputField;

    @FindBy(id = "com.solvd.carinademoapplication:id/password")
    private ExtendedWebElement passwordInputField;

    @FindBy(id = "com.solvd.carinademoapplication:id/radio_male")
    private ExtendedWebElement maleRadioBtn;

    @FindBy(id = "com.solvd.carinademoapplication:id/radio_female")
    private ExtendedWebElement femaleRadioBtn;

    @FindBy(id = "com.solvd.carinademoapplication:id/checkbox")
    private ExtendedWebElement privacyPolicyCheckbox;

    @FindBy(id = "com.solvd.carinademoapplication:id/login_button")
    private ExtendedWebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeName(String name) {
        nameInputField.type(name);
        hideKeyboard();
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    @Override
    public String getNameFieldText() {
        return nameInputField.getText();
    }

    @Override
    public String getPasswordFieldText() {
        return passwordInputField.getText();
    }

    @Override
    public void selectMaleSex() {
        maleRadioBtn.click();
    }

    @Override
    public void selectSex(Sex sex) {
        if(sex.equals(Sex.male)) maleRadioBtn.click();
        else femaleRadioBtn.click();
    }

    @Override
    public boolean isSexChecked(Sex sex) {
        if(sex.equals(Sex.male)) return maleRadioBtn.isChecked();
        else return femaleRadioBtn.isChecked();
    }

    @Override
    public void checkPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    @Override
    public boolean isPrivacyPolicyChecked() {
        return privacyPolicyCheckbox.isChecked();
    }

    @Override
    public CarinaDescriptionPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), CarinaDescriptionPageBase.class);
    }

    @Override
    public boolean isLoginBtnActive() {
        return Boolean.parseBoolean(loginBtn.getAttribute("enabled"));
    }

    @Override
    public boolean isLoginPageOpened() {
        return carinaTitle.isElementPresent();
    }

    @Override
    public boolean isNameInputFieldPresent() {
        return nameInputField.isPresent();
    }

    @Override
    public boolean isPasswordInputFieldPresent() {
        return passwordInputField.isPresent();
    }

    @Override
    public boolean isSexRadioBtnPresent(Sex sex) {
        if(sex.equals(Sex.male)) return maleRadioBtn.isPresent();
        else return femaleRadioBtn.isPresent();
    }

    @Override
    public boolean isPrivacyPolicyCheckboxPresent() {
        return privacyPolicyCheckbox.isPresent();
    }

    @Override
    public boolean isLoginBtnPresent() {
        return loginBtn.isPresent();
    }

    @Override
    public CarinaDescriptionPageBase login() {
        String username = "Test user";
        String password = RandomStringUtils.randomAlphabetic(10);
        typeName(username);
        typePassword(password);
        selectSex(Sex.male);
        checkPrivacyPolicyCheckbox();
        return clickLoginBtn();
    }

}

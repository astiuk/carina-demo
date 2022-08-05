package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoginPageBase extends AbstractPage {

	public LoginPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract void typeName(String name);

	public abstract void typePassword(String password);

	public abstract String getNameFieldText();

	public abstract String getPasswordFieldText();

	public abstract void selectMaleSex();

	public abstract void selectSex(Sex sex);

	public abstract boolean isSexChecked(Sex sex);

	public abstract void checkPrivacyPolicyCheckbox();

	public abstract boolean isPrivacyPolicyChecked();

	public abstract CarinaDescriptionPageBase clickLoginBtn();

	public abstract boolean isLoginBtnActive();

	public abstract boolean isPageOpen();

	public abstract boolean isNameInputFieldPresent();

	public abstract boolean isPasswordInputFieldPresent();

	public abstract boolean isSexRadioBtnPresent(Sex sex);

	public abstract boolean isPrivacyPolicyCheckboxPresent();

	public abstract boolean isLoginBtnPresent();

	public abstract CarinaDescriptionPageBase login();

	public enum Sex {
		male,
		female
	}

}

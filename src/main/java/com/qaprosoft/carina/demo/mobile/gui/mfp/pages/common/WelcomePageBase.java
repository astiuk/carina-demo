package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MfpWelcomePageBase extends AbstractPage {

    public MfpWelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract MfpLoginPageBase clickLoginButton();
}

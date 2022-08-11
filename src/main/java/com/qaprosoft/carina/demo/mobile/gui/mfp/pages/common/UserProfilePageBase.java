package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class UserProfilePageBase extends AbstractPage {

    public UserProfilePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getUserName();
}

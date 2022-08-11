package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DashboardPageBase extends AbstractPage {

    public DashboardPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract UserProfilePageBase openUserProfile();
}

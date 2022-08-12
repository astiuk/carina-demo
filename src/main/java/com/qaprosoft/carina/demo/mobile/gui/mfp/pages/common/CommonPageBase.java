package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CommonPageBase extends AbstractPage {
    public CommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isUserLoggedIn(String username);

    public abstract AbstractPage clickBottomNavigatorButton(BottomNavigatorButtons button);

    public enum BottomNavigatorButtons{
        DASHBOARD("Dashboard"),
        DIARY("Diary"),
        NEWSFEED("Newsfeed"),
        PLANS("Plans");

        String button;

        BottomNavigatorButtons(String button) {
            this.button = button;
        }

        public String getButton() {
            return button;
        }
    }
}

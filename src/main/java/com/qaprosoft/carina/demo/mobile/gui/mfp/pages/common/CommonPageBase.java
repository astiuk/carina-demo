package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.BottomNavigatorButtons;
import org.openqa.selenium.WebDriver;

public abstract class CommonPageBase extends AbstractPage {
    public CommonPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isUserLoggedIn(String username);

    public abstract AbstractPage clickBottomNavigatorButton(BottomNavigatorButtons button);

    public abstract void clickCloseModalButton();

    public abstract boolean isItemByTextPresent(String text);

}

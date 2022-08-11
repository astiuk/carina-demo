package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

//TODO: remake component to page
public abstract class HomeScreenTipPopUpBase extends AbstractPage {

    public HomeScreenTipPopUpBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickCloseButton();
}

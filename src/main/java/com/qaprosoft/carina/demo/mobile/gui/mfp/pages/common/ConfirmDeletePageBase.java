package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ConfirmDeletePageBase extends AbstractPage {

    public ConfirmDeletePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase clickDelete();
}

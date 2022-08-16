package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class QuickAddPageBase extends AbstractPage {

    public QuickAddPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void fillAllFields(int fat, int carbs, int protein);

    public abstract int getCalories();
}

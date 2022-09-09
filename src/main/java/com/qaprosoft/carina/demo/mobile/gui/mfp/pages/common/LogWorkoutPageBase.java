package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LogWorkoutPageBase extends AbstractPage {

    public LogWorkoutPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract PlansTasksPageBase clickCheckmarkButton();
}

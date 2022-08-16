package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage {

    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isDiaryClean();

    public abstract void clearDiary();

    public abstract int getGoalCalories();

    public abstract int getRemainCalories();
}

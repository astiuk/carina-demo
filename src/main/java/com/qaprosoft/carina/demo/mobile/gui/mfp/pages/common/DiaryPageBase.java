package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android.DiaryPage;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage {

    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isDiaryClean();

    public abstract void clearDiary();

    public abstract int getGoalCalories();

    public abstract int getRemainCalories();

    public abstract QuickAddPageBase openQuickAddPage(Meals meal);

    public enum Meals {
        BREAKFAST(1),
        LUNCH(2),
        DINNER(3),
        SNACKS(4);

        private int mealNumber;

        Meals(int mealNumber) {
            this.mealNumber = mealNumber;
        }

        public int getMealNumber() {
            return mealNumber;
        }
    }
}

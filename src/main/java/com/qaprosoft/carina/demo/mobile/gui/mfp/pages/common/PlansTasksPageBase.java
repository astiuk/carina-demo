package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PlansTasksPageBase extends AbstractPage {

    public PlansTasksPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickLetsDoThisButton();

    public abstract PlansPageBase clickPlusButtonIfPresent();

    public abstract void clickThreeDotsButton();

    public abstract EndPlanPageBase clickEndPlanDropdownButton();

    public abstract WorkoutDetailsPageBase openWorkoutDetails();

    public abstract LogWorkoutPageBase openLogWorkoutPage();

    public abstract boolean isWorkoutLoggedMessagePopUpPresent();
}

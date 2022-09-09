package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansTasksPageBase.class)
public class PlansTasksPage extends PlansTasksPageBase {

    @FindBy(id = "com.myfitnesspal.android.plans:id/welcomeActionBtn")
    private ExtendedWebElement letsDoThisButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/action_show_plans_hub")
    private ExtendedWebElement plusButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/task_day_more_menu")
    private ExtendedWebElement threeDotsButton;

    @FindBy(xpath = "//android.widget.TextView[@text='End Plan']")
    private ExtendedWebElement endPlanDropdownButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/workoutName")
    private ExtendedWebElement workoutName;

    @FindBy(id = "com.myfitnesspal.android.plans:id/logWorkout")
    private ExtendedWebElement logWorkoutButton;

    @FindBy(id = "com.myfitnesspal.android:id/snackbar_text")
    private ExtendedWebElement workoutLoggedMessagePopUp;

    public PlansTasksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickLetsDoThisButton() {
        letsDoThisButton.click(3);
    }

    @Override
    public PlansPageBase clickPlusButtonIfPresent() {
        plusButton.clickIfPresent(2);
        return initPage(getDriver(), PlansPageBase.class);
    }

    @Override
    public void clickThreeDotsButton() {
        threeDotsButton.click(3);
    }

    @Override
    public EndPlanPageBase clickEndPlanDropdownButton() {
        endPlanDropdownButton.click(3);
        return initPage(getDriver(), EndPlanPageBase.class);
    }

    @Override
    public WorkoutDetailsPageBase openWorkoutDetails() {
        workoutName.click(3);
        return initPage(getDriver(), WorkoutDetailsPageBase.class);
    }

    @Override
    public LogWorkoutPageBase openLogWorkoutPage() {
        logWorkoutButton.click(3);
        return initPage(getDriver(), LogWorkoutPageBase.class);
    }

    @Override
    public boolean isWorkoutLoggedMessagePopUpPresent() {
        return workoutLoggedMessagePopUp.isPresent(3);
    }
}

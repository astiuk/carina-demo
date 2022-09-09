package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.*;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PlansTasksPageBase.class)
public class PlansTasksPage extends PlansTasksPageBase {

    public PlansTasksPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickLetsDoThisButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public PlansPageBase clickPlusButtonIfPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickThreeDotsButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public EndPlanPageBase clickEndPlanDropdownButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public WorkoutDetailsPageBase openWorkoutDetails() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public LogWorkoutPageBase openLogWorkoutPage() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isWorkoutLoggedMessagePopUpPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

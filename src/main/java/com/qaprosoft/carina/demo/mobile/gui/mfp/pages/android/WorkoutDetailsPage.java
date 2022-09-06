package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.WorkoutDetailsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WorkoutDetailsPageBase.class)
public class WorkoutDetailsPage extends WorkoutDetailsPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/gymworkouts_toolbar_title")
    private ExtendedWebElement workoutDetailsTitle;

    public WorkoutDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return workoutDetailsTitle.isPresent(3);
    }
}

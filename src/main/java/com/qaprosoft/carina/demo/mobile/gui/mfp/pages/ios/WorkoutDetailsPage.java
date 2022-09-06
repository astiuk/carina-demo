package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.WorkoutDetailsPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WorkoutDetailsPageBase.class)
public class WorkoutDetailsPage extends WorkoutDetailsPageBase {

    public WorkoutDetailsPage(WebDriver driver) {
        super(driver);
    }
}

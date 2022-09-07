package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.LogWorkoutPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansTasksPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LogWorkoutPageBase.class)
public class LogWorkoutPage extends LogWorkoutPageBase {

    public LogWorkoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PlansTasksPageBase clickCheckmarkButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

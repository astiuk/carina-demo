package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.enums.EndPlanReasons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.EndPlanPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = EndPlanPageBase.class)
public class EndPlanPage extends EndPlanPageBase {

    public EndPlanPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkReasonCheckbox(EndPlanReasons reason) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void uncheckReasonCheckbox(EndPlanReasons reason) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isReasonCheckboxChecked(EndPlanReasons reason) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public PlansPageBase clickEndButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isEndButtonEnabled() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

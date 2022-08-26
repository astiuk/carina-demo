package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PlanDetailsPageBase.class)
public class PlanDetailsPage extends PlanDetailsPageBase {
    public PlanDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PlansPageBase clickStarPlanButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isNewPlanContinueButtonPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public PlansPageBase clickNewPlanContinueButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

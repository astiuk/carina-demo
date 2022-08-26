package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.enums.AvailablePlans;
import com.qaprosoft.carina.demo.mobile.enums.PlanFilterRadioButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAvailablePlansCardNamePresent(AvailablePlans availablePlan) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isAvailablePlansCardDetailsPresent(AvailablePlans availablePlan) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public PlanDetailsPageBase clickAvailablePlan(AvailablePlans availablePlan) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickWelcomeToPlanActionButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickShowPlansButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isTakeTheSurveyLinkPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isFilterByTextPresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isFilterButtonPresent(PlanFilterRadioButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickFilterButton(PlanFilterRadioButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isElementByTextPresent(String text) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void selectPlan(AvailablePlans plan) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

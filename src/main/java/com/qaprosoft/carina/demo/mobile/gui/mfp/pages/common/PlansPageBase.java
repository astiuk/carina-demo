package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.AvailablePlans;
import com.qaprosoft.carina.demo.mobile.enums.PlanFilterRadioButtons;
import org.openqa.selenium.WebDriver;

public abstract class PlansPageBase extends AbstractPage implements IMobileUtils {

    public PlansPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isAvailablePlansCardNamePresent(AvailablePlans availablePlan);

    public abstract boolean isAvailablePlansCardDetailsPresent(AvailablePlans availablePlan);

    public abstract PlanDetailsPageBase clickAvailablePlan(AvailablePlans availablePlan);

    public abstract void clickWelcomeToPlanActionButton();

    public abstract void clickShowPlansButton();

    public abstract boolean isTakeTheSurveyLinkPresent();

    public abstract boolean isFilterByTextPresent();

    public abstract boolean isFilterButtonPresent(PlanFilterRadioButtons button);

    public abstract void clickFilterButton(PlanFilterRadioButtons button);

    public abstract boolean isElementByTextPresent(String text);
}

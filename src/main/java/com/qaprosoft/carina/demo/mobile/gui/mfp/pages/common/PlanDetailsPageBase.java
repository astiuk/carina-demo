package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PlanDetailsPageBase extends AbstractPage {

    public PlanDetailsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract PlansPageBase clickStarPlanButton();

    public abstract boolean isNewPlanContinueButtonPresent();

    public abstract PlansPageBase clickNewPlanContinueButton();
}

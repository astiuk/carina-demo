package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PlanDetailsPageBase extends AbstractPage implements IMobileUtils {

    public PlanDetailsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract PlansPageBase clickStarPlanButton();

    public abstract EndPlanPageBase clickEndPlanButton();

    public abstract PlansPageBase clickNewPlanContinueButtonIfPresent();
}

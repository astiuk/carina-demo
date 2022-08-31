package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.EndPlanReasons;
import org.openqa.selenium.WebDriver;

public abstract class EndPlanPageBase extends AbstractPage implements IMobileUtils {

    public EndPlanPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void checkReasonCheckbox(EndPlanReasons reason);

    public abstract void uncheckReasonCheckbox(EndPlanReasons reason);

    public abstract boolean isReasonCheckboxChecked(EndPlanReasons reason);

    public abstract PlansPageBase clickEndButton();

    public abstract boolean isEndButtonEnabled();
}

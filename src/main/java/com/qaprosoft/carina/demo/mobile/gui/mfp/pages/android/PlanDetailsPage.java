package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlanDetailsPageBase.class)
public class PlanDetailsPage extends PlanDetailsPageBase {

    @FindBy(id = "com.myfitnesspal.android.plans:id/btnStartPlan")
    private ExtendedWebElement startPlanButton;

    @FindBy(id = "com.myfitnesspal.android:id/positiveBtn")
    private ExtendedWebElement newPlanContinueButton;

    public PlanDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PlansPageBase clickStarPlanButton() {
        swipe(startPlanButton, Direction.VERTICAL, 5, 500);
        startPlanButton.click(3);
        return initPage(getDriver(), PlansPageBase.class);
    }

    @Override
    public PlansPageBase clickNewPlanContinueButtonIfPresent() {
        newPlanContinueButton.clickIfPresent(2);
        return initPage(getDriver(), PlansPageBase.class);
    }
}

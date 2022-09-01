package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.enums.EndPlanReasons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.EndPlanPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EndPlanPageBase.class)
public class EndPlanPage extends EndPlanPageBase {

    @FindBy(xpath = "//*[@text=\"%s\"]")
    private ExtendedWebElement reasonCheckbox;

    @FindBy(id = "com.myfitnesspal.android.plans:id/endPlan")
    private ExtendedWebElement endButton;

    public EndPlanPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkReasonCheckbox(EndPlanReasons reason) {
        swipe(reasonCheckbox.format(reason.getReasonText()), Direction.VERTICAL, 5, 500);
        reasonCheckbox.format(reason.getReasonText()).check();
    }

    @Override
    public void uncheckReasonCheckbox(EndPlanReasons reason) {
        swipe(reasonCheckbox.format(reason.getReasonText()), Direction.VERTICAL, 5, 500);
        reasonCheckbox.format(reason.getReasonText()).uncheck();
    }

    @Override
    public boolean isReasonCheckboxChecked(EndPlanReasons reason) {
        return reasonCheckbox.format(reason.getReasonText()).isChecked();
    }

    @Override
    public PlansPageBase clickEndButton() {
        endButton.click(3);
        return initPage(getDriver(), PlansPageBase.class);
    }

    @Override
    public boolean isEndButtonEnabled() {
        return Boolean.parseBoolean(endButton.getAttribute("enabled"));
    }
}

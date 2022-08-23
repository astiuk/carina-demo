package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.enums.AvailablePlans;
import com.qaprosoft.carina.demo.mobile.enums.PlanFilterRadioButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    @FindBy(id = "com.myfitnesspal.android.plans:id/textTitle")
    private ExtendedWebElement findAPlanTitle;

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement elementByText;

    @FindBy(id = "com.myfitnesspal.android.plans:id/take_the_survey")
    private ExtendedWebElement takeTheSurveyLink;

    @FindBy(id = "com.myfitnesspal.android.plans:id/textFilterBy")
    private ExtendedWebElement filterByText;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android.plans:id/chipGroupFilterTags']/*[@text='%s']")
    private ExtendedWebElement filterRadioButton;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAvailablePlansCardNamePresent(AvailablePlans availablePlan) {
        swipe(elementByText.format(availablePlan.getPlanName()), IMobileUtils.Direction.VERTICAL, 5, 1000);
        return elementByText.format(availablePlan.getPlanName()).isPresent(3);
    }

    @Override
    public boolean isAvailablePlansCardDetailsPresent(AvailablePlans availablePlan) {
        swipe(elementByText.format(availablePlan.getPlanDetails()), IMobileUtils.Direction.VERTICAL, 5, 1000);
        return elementByText.format(availablePlan.getPlanDetails()).isPresent(3);
    }

    @Override
    public boolean isTakeTheSurveyLinkPresent() {
        return takeTheSurveyLink.isPresent(3);
    }

    @Override
    public boolean isFilterByTextPresent() {
        return filterByText.isPresent(3);
    }

    @Override
    public boolean isFilterButtonPresent(PlanFilterRadioButtons button) {
        return filterRadioButton.format(button.getButtonText()).isPresent(3);
    }

    @Override
    public boolean isElementByTextPresent(String text) {
        swipe(elementByText.format(text), Direction.VERTICAL, 26, 500);
        return elementByText.format(text).isPresent(3);
    }

    @Override
    public boolean isPageOpened() {
        return findAPlanTitle.isPresent(3);
    }
}

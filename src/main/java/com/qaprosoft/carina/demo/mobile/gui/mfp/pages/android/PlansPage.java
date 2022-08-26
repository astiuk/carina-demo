package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.enums.AvailablePlans;
import com.qaprosoft.carina.demo.mobile.enums.PlanFilterRadioButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    @FindBy(id = "com.myfitnesspal.android.plans:id/textTitle")
    private ExtendedWebElement findAPlanTitle;

    @FindBy(xpath = "//*[contains(@text,'%s')]")
    private ExtendedWebElement elementByText;

    @FindBy(id = "com.myfitnesspal.android.plans:id/take_the_survey")
    private ExtendedWebElement takeTheSurveyLink;

    @FindBy(id = "com.myfitnesspal.android.plans:id/textFilterBy")
    private ExtendedWebElement filterByText;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android.plans:id/chipGroupFilterTags']/*[@text='%s']")
    private ExtendedWebElement filterRadioButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/welcomeActionBtn")
    private ExtendedWebElement welcomeToPlanActionButton;

    @FindBy(id = "com.myfitnesspal.android.plans:id/action_show_plans_hub")
    private ExtendedWebElement showPlansButton;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAvailablePlansCardNamePresent(AvailablePlans availablePlan) {
        swipe(elementByText.format(availablePlan.getPlanName()), Direction.VERTICAL, 5, 500);
        return elementByText.format(availablePlan.getPlanName()).isPresent(3);
    }

    @Override
    public boolean isAvailablePlansCardDetailsPresent(AvailablePlans availablePlan) {
        swipe(elementByText.format(availablePlan.getPlanDetails()), Direction.VERTICAL, 5, 500);
        return elementByText.format(availablePlan.getPlanDetails()).isPresent(3);
    }

    @Override
    public PlanDetailsPageBase clickAvailablePlan(AvailablePlans availablePlan) {
        swipe(elementByText.format(availablePlan.getPlanName()), Direction.VERTICAL, 5, 500);
        elementByText.format(availablePlan.getPlanName()).click(3);
        return initPage(getDriver(), PlanDetailsPageBase.class);
    }

    @Override
    public void clickWelcomeToPlanActionButton() {
        welcomeToPlanActionButton.click(3);
    }

    @Override
    public void clickShowPlansButton() {
        showPlansButton.clickIfPresent(2);
    }

    @Override
    public boolean isTakeTheSurveyLinkPresent() {
        swipe(takeTheSurveyLink, Direction.VERTICAL, 26, 500);
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
    public void clickFilterButton(PlanFilterRadioButtons button) {
        filterRadioButton.format(button.getButtonText()).click();
    }

    @Override
    public boolean isElementByTextPresent(String text) {
        swipe(elementByText.format(text), Direction.VERTICAL, 26, 500);
        return elementByText.format(text).isPresent(3);
    }

    @Override
    public void selectPlan(AvailablePlans plan) {
        showPlansButton.clickIfPresent(2);
        PlanDetailsPageBase planDetailsPage = clickAvailablePlan(plan);
        planDetailsPage.clickStarPlanButton();
        planDetailsPage.clickNewPlanContinueButton();
        welcomeToPlanActionButton.click(2);
        clickShowPlansButton();
    }

    @Override
    public boolean isPageOpened() {
        return findAPlanTitle.isPresent(3);
    }
}

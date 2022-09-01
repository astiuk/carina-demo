package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.enums.AvailablePlans;
import com.qaprosoft.carina.demo.mobile.enums.PlanFilterRadioButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansTasksPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/*[@text='Plans']")
    private ExtendedWebElement planTitle;

    @FindBy(xpath = "//*[contains(@text,'%s')]")
    private ExtendedWebElement elementByText;

    @FindBy(id = "com.myfitnesspal.android.plans:id/take_the_survey")
    private ExtendedWebElement takeTheSurveyLink;

    @FindBy(id = "com.myfitnesspal.android.plans:id/textFilterBy")
    private ExtendedWebElement filterByText;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android.plans:id/chipGroupFilterTags']/*[@text='%s']")
    private ExtendedWebElement filterRadioButton;

    @FindBy(xpath = "//*[contains(@text, 'Available Plans')]/following-sibling::androidx.cardview.widget.CardView//android.widget.TextView[1]")
    private ExtendedWebElement firstAvailablePlanName;

    @ExtendedFindBy(accessibilityId = "Navigate up")
    private ExtendedWebElement backArrowButton;

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
    public AvailablePlans getFirstAvailablePlan() {
        swipe(firstAvailablePlanName, Direction.VERTICAL, 3, 500);
        return AvailablePlans.getPlanByName(firstAvailablePlanName.getText());
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
        PlansTasksPageBase plansTasksPage = initPage(getDriver(), PlansTasksPageBase.class);
        plansTasksPage.clickPlusButtonIfPresent();
        PlanDetailsPageBase planDetailsPage = clickAvailablePlan(plan);
        planDetailsPage.clickStarPlanButton();
        planDetailsPage.clickNewPlanContinueButtonIfPresent();
        plansTasksPage.clickLetsDoThisButton();
        plansTasksPage.clickPlusButtonIfPresent();
    }

    @Override
    public PlansTasksPageBase clickBackArrowButton() {
        backArrowButton.click(3);
        return initPage(getDriver(), PlansTasksPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return planTitle.isPresent(3);
    }
}

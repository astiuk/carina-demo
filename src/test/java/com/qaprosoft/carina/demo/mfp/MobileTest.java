package com.qaprosoft.carina.demo.mfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.AvailablePlans;
import com.qaprosoft.carina.demo.mobile.enums.BottomNavigatorButtons;
import com.qaprosoft.carina.demo.mobile.enums.PlanFilterRadioButtons;
import com.qaprosoft.carina.demo.mobile.enums.PremiumOptions;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.*;
import com.qaprosoft.carina.demo.mobile.interfaces.IConstants;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MobileTest implements IAbstractTest, IMobileUtils {

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void userLoginTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "1")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void bottomNavigationButtonsTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        AbstractPage dashboardPage = commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.DASHBOARD);
        Assert.assertTrue(dashboardPage.isPageOpened(), "Dashboard page isn't opened");
        AbstractPage diaryPage = commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.DIARY);
        Assert.assertTrue(diaryPage.isPageOpened(), "Diary page isn't opened");
        AbstractPage newsfeedPage = commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.NEWSFEED);
        Assert.assertTrue(newsfeedPage.isPageOpened(), "Newsfeed page isn't opened");
        AbstractPage plansPage = commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Diary page isn't opened");
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "2")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void goalCaloriesEqualsRemainCaloriesTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.DIARY);
        diaryPage.clearDiary();
        Assert.assertEquals(diaryPage.getGoalCalories(), diaryPage.getRemainCalories(),
                "Goal calories and remain calories aren't equal");
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "3")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void caloriesValidationOnQuickAddTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.DIARY);
        QuickAddPageBase quickAddPage = diaryPage.openQuickAddPage(DiaryPageBase.Meals.BREAKFAST);
        quickAddPage.fillAllFields(1, 1, 1);
        Assert.assertEquals(quickAddPage.getCalories(), 17, "Calories calculation is wrong");
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "4, 5")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void customDashboardTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.DIARY);
        diaryPage.selectCustomDashboard(CustomDashboardPageBase.Options.CALORIES_FOCUS);
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.GOAL),
                IConstants.GOAL + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FOOD),
                IConstants.FOOD + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.EXERCISE),
                IConstants.EXERCISE + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.REMAINING),
                IConstants.REMAINING + " label is not present");

        diaryPage.selectCustomDashboard(CustomDashboardPageBase.Options.MACRONUTRIENT_FOCUS);
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CARBS),
                IConstants.CARBS + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FAT),
                IConstants.FAT + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.PROTEIN),
                IConstants.PROTEIN + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES),
                IConstants.CALORIES + " label is not present");

        diaryPage.selectCustomDashboard(CustomDashboardPageBase.Options.HEART_HEALTHY);
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FAT),
                IConstants.FAT + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.SODIUM),
                IConstants.SODIUM + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CHOLESTEROL),
                IConstants.CHOLESTEROL + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES),
                IConstants.CALORIES + " label is not present");

        diaryPage.selectCustomDashboard(CustomDashboardPageBase.Options.LOW_CARB);
        commonPage.clickCloseModalButton();
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CARBS),
                IConstants.CARBS + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.SUGAR),
                IConstants.SUGAR + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FIBER),
                IConstants.FIBER + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES),
                IConstants.CALORIES + " label is not present");

        CustomSummaryPageBase customSummaryPage = (CustomSummaryPageBase) diaryPage.selectCustomDashboard(
                CustomDashboardPageBase.Options.CUSTOM);
        customSummaryPage.checkNutrient(CustomSummaryPageBase.Nutrients.FAT);
        softAssert.assertTrue(customSummaryPage.isNutrientChecked(CustomSummaryPageBase.Nutrients.FAT),
                CustomSummaryPageBase.Nutrients.FAT + " nutrient isn't checked");
        customSummaryPage.checkNutrient(CustomSummaryPageBase.Nutrients.CARBOHYDRATES);
        softAssert.assertTrue(customSummaryPage.isNutrientChecked(CustomSummaryPageBase.Nutrients.CARBOHYDRATES),
                CustomSummaryPageBase.Nutrients.CARBOHYDRATES + " nutrient isn't checked");
        customSummaryPage.checkNutrient(CustomSummaryPageBase.Nutrients.PROTEIN);
        softAssert.assertTrue(customSummaryPage.isNutrientChecked(CustomSummaryPageBase.Nutrients.PROTEIN),
                CustomSummaryPageBase.Nutrients.PROTEIN + " nutrient isn't checked");
        customSummaryPage.clickDoneButton();
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.PROTEIN),
                IConstants.PROTEIN + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.FAT),
                IConstants.FAT + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CARBS),
                IConstants.CARBS + " label is not present");
        softAssert.assertTrue(commonPage.isItemByTextPresent(IConstants.CALORIES),
                IConstants.CALORIES + " label is not present");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "6")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void customSummaryNutrientsTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.DIARY);
        CustomSummaryPageBase customSummaryPage = (CustomSummaryPageBase) diaryPage.selectCustomDashboard(
                CustomDashboardPageBase.Options.CUSTOM);
        Assert.assertTrue(commonPage.isItemByTextPresent(IConstants.THREE_OF_THREE_NUTRIENTS_SELECTED),
                IConstants.THREE_OF_THREE_NUTRIENTS_SELECTED + " text isn't present");
        Assert.assertTrue(customSummaryPage.isDoneButtonActive(),
                "Save button isn't active when 3 nutrients are selected");
        customSummaryPage.uncheckNutrient(CustomSummaryPageBase.Nutrients.FAT);
        Assert.assertTrue(commonPage.isItemByTextPresent(IConstants.TWO_OF_THREE_NUTRIENTS_SELECTED),
                IConstants.TWO_OF_THREE_NUTRIENTS_SELECTED + " text isn't present");
        Assert.assertFalse(customSummaryPage.isDoneButtonActive(),
                "Save button is active after choosing 2 nutrients");
        customSummaryPage.checkNutrient(CustomSummaryPageBase.Nutrients.FAT);
        customSummaryPage.checkNutrient(CustomSummaryPageBase.Nutrients.SAT_FAT);
        Assert.assertTrue(commonPage.isItemByTextPresent(IConstants.FOUR_NUTRIENTS_SELECTED),
                IConstants.FOUR_NUTRIENTS_SELECTED + " text isn't present");
        Assert.assertFalse(customSummaryPage.isDoneButtonActive(),
                "Save button is active after choosing 4 nutrients");
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "7")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void moreMenuOptionsValidationTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        MoreMenuPageBase moreMenuPage = (MoreMenuPageBase) commonPage.clickBottomNavigatorButton(
                BottomNavigatorButtons.MORE);
        Assert.assertTrue(moreMenuPage.isPageOpened(), "More menu page isn't opened");
        for (MoreMenuPageBase.MoreOptions option : MoreMenuPageBase.MoreOptions.values()) {
            softAssert.assertTrue(moreMenuPage.isMoreOptionPresent(option),
                    String.format("More option \"%s\" isn't present", option.getOptionText()));
        }
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "8")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void myPremiumToolsPageValidationTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        MoreMenuPageBase moreMenuPage = (MoreMenuPageBase) commonPage.clickBottomNavigatorButton(
                BottomNavigatorButtons.MORE);
        Assert.assertTrue(moreMenuPage.isPageOpened(), "More menu page isn't opened");
        MyPremiumToolsPageBase myPremiumToolsPage = (MyPremiumToolsPageBase) moreMenuPage.clickMoreOption(
                MoreMenuPageBase.MoreOptions.MY_PREMIUM_TOOLS);
        for (PremiumOptions option : PremiumOptions.values()) {
            softAssert.assertTrue(myPremiumToolsPage.isPremiumOptionTitlePresent(option),
                    String.format("Premium option title \"%s\" isn't present", option.getOptionTitle()));
            softAssert.assertTrue(myPremiumToolsPage.isPremiumOptionDescriptionPresent(option),
                    String.format("Premium option description \"%s\" isn't present", option.getOptionDescription()));
        }
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "9")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void plansPageValidationTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        PlansPageBase plansPage = (PlansPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Plans page isn't opened");
        softAssert.assertTrue(plansPage.isElementByTextPresent(IConstants.FIND_A_PLAN),
                String.format("\"%s\" text isn't present", IConstants.FIND_A_PLAN));
        softAssert.assertTrue(plansPage.isElementByTextPresent(IConstants.PLANS_DESCRIPTION),
                String.format("\"%s\" text isn't present", IConstants.PLANS_DESCRIPTION));

        softAssert.assertTrue(plansPage.isFilterByTextPresent(), "\"Filter by\" text isn't present");
        for(PlanFilterRadioButtons button : PlanFilterRadioButtons.values()) {
            softAssert.assertTrue(plansPage.isFilterButtonPresent(button),
                    String.format("\"%s\" text isn't present", button.getButtonText()));
        }

        softAssert.assertTrue(plansPage.isElementByTextPresent(IConstants.LOOKING_FOR_MORE_PLANS),
                String.format("\"%s\" text isn't present", IConstants.LOOKING_FOR_MORE_PLANS));
        softAssert.assertTrue(plansPage.isElementByTextPresent(IConstants.PLANS_LET_US_KNOW),
                String.format("\"%s\" text isn't present", IConstants.PLANS_LET_US_KNOW));
        softAssert.assertTrue(plansPage.isTakeTheSurveyLinkPresent(), "Take The Survey link isn't present");
        softAssert.assertAll();
    }

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "10")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void plansFilterTest() {
        SoftAssert softAssert = new SoftAssert();
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        PlansPageBase plansPage = (PlansPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.PLANS);
        Assert.assertTrue(plansPage.isPageOpened(), "Plans page isn't opened");
        for(PlanFilterRadioButtons button : PlanFilterRadioButtons.values()) {
            plansPage.clickFilterButton(button);
            for(AvailablePlans plan : button.getFilterPlans()) {
                softAssert.assertTrue(plansPage.isAvailablePlansCardNamePresent(plan),
                        String.format("\"%s\" name isn't present", plan.getPlanName()));
                softAssert.assertTrue(plansPage.isAvailablePlansCardDetailsPresent(plan),
                        String.format("\"%s\" details isn't present", plan.getPlanDetails()));
            }
        }
        softAssert.assertAll();
    }


    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestRailCases(testCasesId = "11")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void twoPlansSelectTest() {
        AvailablePlans firstPlan;
        AvailablePlans secondPlan;
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        PlansPageBase plansPage = (PlansPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.PLANS);

        plansPage.clickShowPlansButton();
        firstPlan = plansPage.getFirstAvailablePlan();
        plansPage.selectPlan(firstPlan);
        secondPlan = plansPage.getFirstAvailablePlan();
        plansPage.selectPlan(secondPlan);
        Assert.assertFalse(commonPage.isItemByTextPresent(firstPlan.getPlanName()) &&
                        !commonPage.isItemByTextPresent(IConstants.AVAILABLE_PLANS),
                String.format("After adding new plan, old plan \"%s\" is still present",
                        firstPlan.getPlanName()));
        Assert.assertTrue(commonPage.isItemByTextPresent(secondPlan.getPlanName()),
                String.format("New plan \"%s\" isn't present", secondPlan.getPlanName()));
    }

}

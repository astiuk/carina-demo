package com.qaprosoft.carina.demo.mfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.BottomNavigatorButtons;
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
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));

        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        DiaryPageBase diaryPage = (DiaryPageBase) commonPage.clickBottomNavigatorButton(BottomNavigatorButtons.DIARY);
        diaryPage.selectCustomDashboard(CustomDashboardPageBase.Options.CALORIES_FOCUS);
        SoftAssert softAssert = new SoftAssert();
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
        softAssert.assertTrue(customSummaryPage.isNutrientChecked(CustomSummaryPageBase.Nutrients.FAT),
                CustomSummaryPageBase.Nutrients.FAT + " nutrient isn't checked");
        softAssert.assertTrue(customSummaryPage.isNutrientChecked(CustomSummaryPageBase.Nutrients.CARBOHYDRATES),
                CustomSummaryPageBase.Nutrients.CARBOHYDRATES + " nutrient isn't checked");
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

}

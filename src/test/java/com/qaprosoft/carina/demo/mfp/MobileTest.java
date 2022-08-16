package com.qaprosoft.carina.demo.mfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.BottomNavigatorButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.*;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}

package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.WelcomePageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MfpMobileTest implements IAbstractTest, IMobileUtils {

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void userLoginTest() {
        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);

        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");

        LoginPageBase loginPage = welcomePage.clickLoginButton();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page isn't opened");

        Assert.assertTrue(loginPage.isEmailFieldPresent(), "Email field isn't present");
        Assert.assertTrue(loginPage.isPasswordFieldPresent(), "Password field isn't present");
        Assert.assertTrue(loginPage.isLoginButtonPresent(), "Login button isn't present");

        loginPage.typeEmail(R.TESTDATA.get("email"));
        loginPage.typePassword(R.TESTDATA.get("password"));
        Assert.assertEquals(loginPage.getEmailText(), R.TESTDATA.get("email"), "Email isn't typed");

        HomePageBase homePage = loginPage.clickLoginButton();
        commonPage.closePopUp();
        Assert.assertTrue(homePage.isPageOpened(), "Home page isn't opened");

    }
}

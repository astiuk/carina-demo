package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.*;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;

public class MfpMobileTest implements IAbstractTest, IMobileUtils {

    @Test
    @MethodOwner(owner = "Hostiuk")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void userLoginTest() {
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        loginPage.login(R.TESTDATA.get("email"), R.TESTDATA.get("password"));
        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        commonPage.isUserLoggedIn(R.TESTDATA.get("username"));
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CustomDashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomDashboardPageBase.class)
public class CustomDashboardPage extends CustomDashboardPageBase {

    public CustomDashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase selectCustomDashboard(Options option) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

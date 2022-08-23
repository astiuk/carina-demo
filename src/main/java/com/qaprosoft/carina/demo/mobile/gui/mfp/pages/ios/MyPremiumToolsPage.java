package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MyPremiumToolsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyPremiumToolsPageBase.class)
public class MyPremiumToolsPage extends MyPremiumToolsPageBase {
    public MyPremiumToolsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPremiumOptionPresent(PremiumOptions premiumOption, PremiumOptions.Options option) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

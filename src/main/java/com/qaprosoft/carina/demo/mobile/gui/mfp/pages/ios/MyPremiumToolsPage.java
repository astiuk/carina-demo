package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.enums.PremiumOptions;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MyPremiumToolsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyPremiumToolsPageBase.class)
public class MyPremiumToolsPage extends MyPremiumToolsPageBase {
    public MyPremiumToolsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPremiumOptionTitlePresent(PremiumOptions premiumOption) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isPremiumOptionDescriptionPresent(PremiumOptions premiumOption) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

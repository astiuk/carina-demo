package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MoreMenuPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MoreMenuPageBase.class)
public class MoreMenuPage extends MoreMenuPageBase {
    public MoreMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void AssertAllOptionsArePresent() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

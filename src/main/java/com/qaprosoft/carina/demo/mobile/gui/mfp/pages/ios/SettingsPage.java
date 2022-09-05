package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.SettingsButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MoreMenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SettingsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase {

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openPage(SettingsButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public MoreMenuPageBase returnToPreviousPage() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

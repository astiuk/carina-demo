package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.PrivacyCenterButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SettingsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PrivacyCenterPageBase.class)
public class PrivacyCenterPage extends PrivacyCenterPageBase {

    public PrivacyCenterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openPage(PrivacyCenterButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public SettingsPageBase returnToPreviousPage() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.SharingAndPrivacySettingsButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SharingAndPrivacySettingsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SharingAndPrivacySettingsPageBase.class)
public class SharingAndPrivacySettingsPage extends SharingAndPrivacySettingsPageBase {

    public SharingAndPrivacySettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openPage(SharingAndPrivacySettingsButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public PrivacyCenterPageBase returnToPreviousPage() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

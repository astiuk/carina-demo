package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.enums.NewsFeedSharingCheckboxes;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsFeedSharingPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SharingAndPrivacySettingsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NewsFeedSharingPageBase.class)
public class NewsFeedSharingPage extends NewsFeedSharingPageBase {

    public NewsFeedSharingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkCheckbox(NewsFeedSharingCheckboxes checkbox) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void uncheckCheckbox(NewsFeedSharingCheckboxes checkbox) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isCheckboxChecked(NewsFeedSharingCheckboxes checkbox) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public SharingAndPrivacySettingsPageBase returnToPreviousPage() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

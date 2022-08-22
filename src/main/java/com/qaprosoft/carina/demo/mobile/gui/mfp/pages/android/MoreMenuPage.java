package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MoreMenuPageBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MoreMenuPageBase.class)
public class MoreMenuPage extends MoreMenuPageBase {
    public MoreMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOptionPresent(MoreOptions option) {
        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        commonPage.SwipeToElementByText(option.getOptionText());
        return commonPage.isItemByTextPresent(option.getOptionText());
    }
}

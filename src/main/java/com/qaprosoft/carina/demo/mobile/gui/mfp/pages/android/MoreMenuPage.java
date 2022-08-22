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
    public void AssertAllOptionsArePresent() {
        CommonPageBase commonPage = initPage(getDriver(), CommonPageBase.class);
        for (MoreOptions option : MoreOptions.values()) {
            commonPage.SwipeToElementByText(option.getOptionText());
            Assert.assertTrue(commonPage.isItemByTextPresent(option.getOptionText()),
                    String.format("More option \"%s\" isn't present", option.getOptionText()));
        }
    }
}

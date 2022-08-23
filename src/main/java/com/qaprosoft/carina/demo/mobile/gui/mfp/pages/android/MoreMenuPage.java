package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MoreMenuPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MoreMenuPageBase.class)
public class MoreMenuPage extends MoreMenuPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/image")
    private ExtendedWebElement userAvatar;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/moreRecyclerView']//*[@text='%s']")
    private ExtendedWebElement moreOption;

    public MoreMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isOptionPresent(MoreOptions option) {
        swipe(moreOption.format(option.getOptionText(), Direction.VERTICAL, 3, 1000));
        return moreOption.format(option.getOptionText()).isPresent(3);
    }

    @Override
    public boolean isPageOpened() {
        return userAvatar.isPresent();
    }
}

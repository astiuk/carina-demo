package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsfeedPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsfeedPageBase.class)
public class NewsfeedPage extends NewsfeedPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/imageCameraButton")
    private ExtendedWebElement cameraButton;

    public NewsfeedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return cameraButton.isPresent();
    }
}

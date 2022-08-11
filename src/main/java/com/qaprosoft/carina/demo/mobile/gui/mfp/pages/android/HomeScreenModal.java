package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomeScreenModalBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeScreenModalBase.class)
public class HomeScreenModal extends HomeScreenModalBase {

    @FindBy(xpath = "(//android.widget.FrameLayout[@resource-id='android:id/content']//android.widget.Button)[1]")
    private ExtendedWebElement closeButton;

    public HomeScreenModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public DashboardPageBase closeModal() {
        closeButton.click();
        return initPage(getDriver(), DashboardPageBase.class);
    }
}

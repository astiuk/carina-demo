package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    @FindBy(id = "com.myfitnesspal.android.plans:id/textTitle")
    private ExtendedWebElement findAPlanTitle;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return findAPlanTitle.isPresent();
    }
}

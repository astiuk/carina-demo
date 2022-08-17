package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.QuickAddPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = QuickAddPageBase.class)
public class QuickAddPage extends QuickAddPageBase {

    public QuickAddPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void fillAllFields(int fat, int carbs, int protein) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public int getCalories() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.HomeScreenModalBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenModalBase.class)
public class HomeScreenModal extends HomeScreenModalBase {

    public HomeScreenModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public DashboardPageBase closeModal() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

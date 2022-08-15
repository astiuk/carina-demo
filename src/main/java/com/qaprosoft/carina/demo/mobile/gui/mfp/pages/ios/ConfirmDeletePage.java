package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.ConfirmDeletePageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = ConfirmDeletePageBase.class)
public class ConfirmDeletePage extends ConfirmDeletePageBase {

    public ConfirmDeletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase clickDelete() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

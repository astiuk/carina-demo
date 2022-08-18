package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase {
    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase clickDoneButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isNutrientChecked(Nutrients nutrient) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

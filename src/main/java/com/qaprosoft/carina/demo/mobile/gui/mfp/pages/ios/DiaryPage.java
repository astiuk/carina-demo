package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.QuickAddPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {
    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDiaryClean() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clearDiary() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public int getGoalCalories() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public int getRemainCalories() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public QuickAddPageBase openQuickAddPage(Meals meal) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

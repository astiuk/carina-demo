package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.EditDiaryPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = EditDiaryPageBase.class)
public class EditDiaryPage extends EditDiaryPageBase {

    public EditDiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickTrashBin() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void checkSelectAll() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public DiaryPageBase clickConfirmDelete() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

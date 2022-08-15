package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.EditDiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.ConfirmDeletePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EditDiaryPageBase.class)
public class EditDiaryPage extends EditDiaryPageBase{

    @ExtendedFindBy(accessibilityId = "View Nutrition")
    private ExtendedWebElement trashBinButton;

    @FindBy(id = "com.myfitnesspal.android:id/select_all")
    private ExtendedWebElement selectAllCheckbox;

    public EditDiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ConfirmDeletePageBase clickTrashBin() {
        trashBinButton.click();
        return initPage(getDriver(), ConfirmDeletePageBase.class);
    }

    @Override
    public void checkSelectAll() {
        selectAllCheckbox.check();
    }
}

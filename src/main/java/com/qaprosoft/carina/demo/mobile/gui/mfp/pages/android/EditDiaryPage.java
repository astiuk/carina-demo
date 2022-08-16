package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.EditDiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EditDiaryPageBase.class)
public class EditDiaryPage extends EditDiaryPageBase{

    @ExtendedFindBy(accessibilityId = "View Nutrition")
    private ExtendedWebElement trashBinButton;

    @FindBy(id = "com.myfitnesspal.android:id/select_all")
    private ExtendedWebElement selectAllCheckbox;

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    private ExtendedWebElement confirmDeleteButton;

    public EditDiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickTrashBin() {
        trashBinButton.click(3);
    }

    @Override
    public void checkSelectAll() {
        selectAllCheckbox.check();
    }

    @Override
    public DiaryPageBase clickConfirmDelete() {
        confirmDeleteButton.click(3);
        return initPage(getDriver(), DiaryPageBase.class);
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class EditDiaryPageBase extends AbstractPage {

    public EditDiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickTrashBin();

    public abstract void checkSelectAll();

    public abstract DiaryPageBase clickConfirmDelete();
}

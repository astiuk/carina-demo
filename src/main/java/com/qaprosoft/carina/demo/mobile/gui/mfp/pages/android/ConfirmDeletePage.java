package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.ConfirmDeletePageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ConfirmDeletePageBase.class)
public class ConfirmDeletePage extends ConfirmDeletePageBase {

    @FindBy(xpath = "//android.widget.Button[@text='Delete']")
    private ExtendedWebElement deleteButton;

    public ConfirmDeletePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase clickDelete() {
        deleteButton.click();
        return initPage(getDriver(), DiaryPageBase.class);
    }
}

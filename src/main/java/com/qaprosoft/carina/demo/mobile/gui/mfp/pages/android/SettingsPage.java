package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.SettingsButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MoreMenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SettingsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/*[@text='Settings']")
    private ExtendedWebElement settingsTitle;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backArrowButton;

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement settingsButton;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openPage(SettingsButtons button) {
        swipe(settingsButton.format(button.getButtonText()), Direction.VERTICAL, 5, 500);
        settingsButton.format(button.getButtonText()).click(3);
        return initPage(getDriver(), button.getPage());
    }

    @Override
    public MoreMenuPageBase returnToPreviousPage() {
        backArrowButton.click(3);
        return initPage(getDriver(), MoreMenuPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return settingsTitle.isPresent(3);
    }
}

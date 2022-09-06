package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.SharingAndPrivacySettingsButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SharingAndPrivacySettingsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SharingAndPrivacySettingsPageBase.class)
public class SharingAndPrivacySettingsPage extends SharingAndPrivacySettingsPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/*[@text='Sharing and Privacy Settings']")
    private ExtendedWebElement sharingAndPrivacySettingsTitle;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backArrowButton;

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement sharingAndPrivacySettingsButton;

    public SharingAndPrivacySettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openPage(SharingAndPrivacySettingsButtons button) {
        sharingAndPrivacySettingsButton.format(button.getButtonText()).click(3);
        return initPage(getDriver(), button.getPage());
    }

    @Override
    public PrivacyCenterPageBase returnToPreviousPage() {
        backArrowButton.click(3);
        return initPage(getDriver(), PrivacyCenterPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return sharingAndPrivacySettingsTitle.isPresent(3);
    }
}

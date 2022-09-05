package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.PrivacyCenterButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SettingsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PrivacyCenterPageBase.class)
public class PrivacyCenterPage extends PrivacyCenterPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/*[@text='Privacy Center']")
    private ExtendedWebElement privacyCenterTitle;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backArrowButton;

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement privacyCenterButton;

    public PrivacyCenterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage openPage(PrivacyCenterButtons button) {
        privacyCenterButton.format(button.getButtonText()).click(3);
        return initPage(getDriver(), button.getPage());
    }

    @Override
    public SettingsPageBase returnToPreviousPage() {
        backArrowButton.click(3);
        return initPage(getDriver(), SettingsPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return privacyCenterTitle.isPresent(3);
    }
}

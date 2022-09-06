package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.SharingAndPrivacySettingsButtons;
import org.openqa.selenium.WebDriver;

public abstract class SharingAndPrivacySettingsPageBase extends AbstractPage {

    public SharingAndPrivacySettingsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openPage(SharingAndPrivacySettingsButtons button);

    public abstract PrivacyCenterPageBase returnToPreviousPage();
}

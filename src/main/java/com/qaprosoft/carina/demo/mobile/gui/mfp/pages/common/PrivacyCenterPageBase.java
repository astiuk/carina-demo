package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.PrivacyCenterButtons;
import org.openqa.selenium.WebDriver;

public abstract class PrivacyCenterPageBase extends AbstractPage implements IMobileUtils {

    public PrivacyCenterPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openPage(PrivacyCenterButtons button);

    public abstract SettingsPageBase returnToPreviousPage();
}

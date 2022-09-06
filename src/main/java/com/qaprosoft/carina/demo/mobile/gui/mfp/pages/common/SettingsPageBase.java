package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.SettingsButtons;
import org.openqa.selenium.WebDriver;

public abstract class SettingsPageBase extends AbstractPage implements IMobileUtils {

    public SettingsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openPage(SettingsButtons button);

    public abstract MoreMenuPageBase returnToPreviousPage();
}

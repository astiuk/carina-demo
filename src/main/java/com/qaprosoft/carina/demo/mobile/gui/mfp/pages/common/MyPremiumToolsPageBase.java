package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.PremiumOptions;
import org.openqa.selenium.WebDriver;

public abstract class MyPremiumToolsPageBase extends AbstractPage implements IMobileUtils {
    public MyPremiumToolsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPremiumOptionTitlePresent(PremiumOptions premiumOption);
    public abstract boolean isPremiumOptionDescriptionPresent(PremiumOptions premiumOption);

}

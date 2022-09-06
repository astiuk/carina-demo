package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.NewsFeedSharingCheckboxes;
import org.openqa.selenium.WebDriver;

public abstract class NewsFeedSharingPageBase extends AbstractPage implements IMobileUtils {

    public NewsFeedSharingPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void checkCheckbox(NewsFeedSharingCheckboxes checkbox);

    public abstract void uncheckCheckbox(NewsFeedSharingCheckboxes checkbox);

    public abstract boolean isCheckboxChecked(NewsFeedSharingCheckboxes checkbox);

    public abstract SharingAndPrivacySettingsPageBase returnToPreviousPage();
}

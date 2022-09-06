package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SharingAndPrivacySettingsPageBase;
import org.apache.commons.lang3.NotImplementedException;

public enum PrivacyCenterButtons {
    TERMS_OF_SERVICE("tos", AbstractPage.class),
    PRIVACY_POLICY("privacy_policy", AbstractPage.class),
    PERSONALIZATION("personalization", AbstractPage.class),
    SHARING_PRIVACY_SETTINGS("sharing_and_privacy", SharingAndPrivacySettingsPageBase.class),
    DO_NOT_SELL_MY_PERSONAL_INFORMATION("do_not_sell", AbstractPage.class),
    CONTACT_SUPPORT("contact_support", AbstractPage.class);

    private String buttonId;
    private Class<? extends AbstractPage> page;

    PrivacyCenterButtons(String buttonId, Class<? extends AbstractPage> page) {
        this.buttonId = buttonId;
        this.page = page;
    }

    public String getButtonId() {
        return buttonId;
    }

    public Class<? extends AbstractPage> getPage() {
        if (page == AbstractPage.class) throw new NotImplementedException(
                String.format("%s page is not implemented", this.buttonId));
        return page;
    }
}

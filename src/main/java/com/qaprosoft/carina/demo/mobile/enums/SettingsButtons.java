package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PrivacyCenterPageBase;

public enum SettingsButtons {
    PRIVACY_CENTER("Privacy Center", PrivacyCenterPageBase.class);

    private String buttonText;
    private Class<? extends AbstractPage> page;

    SettingsButtons(String buttonText, Class<? extends AbstractPage> page) {
        this.buttonText = buttonText;
        this.page = page;
    }

    public String getButtonText() {
        return buttonText;
    }

    public Class<? extends AbstractPage> getPage() {
        return page;
    }
}

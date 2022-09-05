package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsFeedSharingPageBase;

public enum SharingAndPrivacySettingsButtons {
    NEWS_FEED_SHARING("News Feed Sharing", NewsFeedSharingPageBase.class);

    private String buttonText;
    private Class<? extends AbstractPage> page;

    SharingAndPrivacySettingsButtons(String buttonText, Class<? extends AbstractPage> page) {
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

package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsFeedSharingPageBase;
import org.apache.commons.lang3.NotImplementedException;

public enum SharingAndPrivacySettingsButtons {
    NEWS_FEED_SHARING("News Feed Sharing", NewsFeedSharingPageBase.class),
    DIARY_SHARING("Diary Sharing", AbstractPage.class),
    EMAIL_SETTINGS("Email Settings", AbstractPage.class),
    FACEBOOK_SETTINGS("Facebook Settings", AbstractPage.class),
    AUTO_PLAY_SETTINGS("Auto-Play Settings", AbstractPage.class);

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
        if (page == AbstractPage.class) throw new NotImplementedException(
                String.format("%s page is not implemented", this.buttonText));
        return page;
    }
}

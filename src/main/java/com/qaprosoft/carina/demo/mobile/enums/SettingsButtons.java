package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PrivacyCenterPageBase;
import org.apache.commons.lang3.NotImplementedException;

public enum SettingsButtons {
    EDIT_PROFILE("textEditProfile", AbstractPage.class),
    MY_GOALS("textMyGoals", AbstractPage.class),
    PREMIUM_SUBSCRIPTION("textPremiumSubscription", AbstractPage.class),
    MY_APPS_N_DEVICES("textAppsDevices", AbstractPage.class),
    DELETE_ACCOUNT("textDeleteAccount", AbstractPage.class),
    CHANGE_PASSWORD("textChangePassword", AbstractPage.class),
    LOG_OUT("textLogOut", AbstractPage.class),
    APPEARANCE("textAppearanceSettings", AbstractPage.class),
    DIARY_SETTINGS("textDiarySettings", AbstractPage.class),
    REMINDERS("textReminders", AbstractPage.class),
    PRIVACY_CENTER("textPrivacyCenter", PrivacyCenterPageBase.class),
    WEEKLY_NUTRITION_SETTINGS("textWeeklyNutrition", AbstractPage.class),
    STEPS("textSteps", AbstractPage.class),
    PUSH_NOTIFICATIONS("textPushNotifications", AbstractPage.class);

    private String buttonId;
    private Class<? extends AbstractPage> page;

    SettingsButtons(String buttonId, Class<? extends AbstractPage> page) {
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

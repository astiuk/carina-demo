package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsfeedPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;

public enum BottomNavigatorButtons {
    DASHBOARD("Dashboard", "", DashboardPageBase.class),
    DIARY("Diary", "", DiaryPageBase.class),
    NEWSFEED("Newsfeed", "", NewsfeedPageBase.class),
    PLANS("Plans", "", PlansPageBase.class);

    private String optionAndroid;
    private String optionIos;
    private Class page;

    BottomNavigatorButtons(String optionAndroid, String optionIos, Class page) {
        this.optionAndroid = optionAndroid;
        this.optionIos = optionIos;
        this.page = page;
    }

    public String getOptionAndroid() {
        return optionAndroid;
    }

    public String getOptionIos() {
        return optionIos;
    }

    public Class getPage() {
        return page;
    }
}

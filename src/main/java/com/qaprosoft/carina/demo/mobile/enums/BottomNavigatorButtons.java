package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsfeedPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.PlansPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MoreMenuPageBase;

public enum BottomNavigatorButtons {
    DASHBOARD("Dashboard", "Dashboard", DashboardPageBase.class),
    DIARY("Diary", "Diary", DiaryPageBase.class),
    NEWSFEED("Newsfeed", "Newsfeed", NewsfeedPageBase.class),
    PLANS("Plans", "Plans", PlansPageBase.class),
    MORE("More", "More", MoreMenuPageBase.class);;

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

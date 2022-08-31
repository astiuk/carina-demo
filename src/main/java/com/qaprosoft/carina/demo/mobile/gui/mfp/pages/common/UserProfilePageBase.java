package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class UserProfilePageBase extends AbstractPage {

    public UserProfilePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getUserName();

    public abstract AbstractPage openTabPage(TabButtons button);

    public enum TabButtons {
        MY_INFO("My Info", MyInfoPageBase.class),
        MY_ITEMS("My Items", MyItemsPageBase.class),
        MY_POSTS("My Posts", MyPostsPageBase.class);

        private String accessibilityId;
        private Class<? extends AbstractPage> page;

        TabButtons(String accessibilityId, Class<? extends AbstractPage> page) {
            this.accessibilityId = accessibilityId;
            this.page = page;
        }

        public String getAccessibilityId() {
            return accessibilityId;
        }

        public Class<? extends AbstractPage> getPage() {
            return page;
        }
    }
}

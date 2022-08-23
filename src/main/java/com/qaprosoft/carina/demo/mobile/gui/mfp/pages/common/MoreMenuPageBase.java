package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

public abstract class MoreMenuPageBase extends AbstractPage implements IMobileUtils {
    public MoreMenuPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isMoreOptionPresent(MoreOptions option);

    public abstract AbstractPage clickMoreOption(MoreOptions option);

    public enum MoreOptions {
        MY_PREMIUM_TOOLS("My Premium Tools", MyPremiumToolsPageBase.class),
        RECIPE_DISCOVERY("Recipe Discovery", AbstractPage.class),
        PROGRESS("Progress", AbstractPage.class),
        WORKOUT_ROUTINE("Workout Routines", AbstractPage.class),
        GOALS("Goals", AbstractPage.class),
        NUTRITION("Nutrition", AbstractPage.class),
        RECIPE_MEALS_FOODS("Recipes, Meals & Foods", AbstractPage.class),
        APPS_AND_DEVICES("Apps & Devices", AbstractPage.class),
        STEPS("Steps", AbstractPage.class),
        COMMUNITY("Community", AbstractPage.class),
        REMINDERS("Reminders", AbstractPage.class),
        FRIENDS("Friends", AbstractPage.class),
        MESSAGES("Messages", AbstractPage.class),
        PRIVACY_CENTER("Privacy Center", AbstractPage.class),
        SETTINGS("Settings", AbstractPage.class),
        HELP("Help", AbstractPage.class);

        private String optionText;
        private Class<? extends AbstractPage> page;

        MoreOptions(String optionText, Class<? extends AbstractPage> page) {
            this.optionText = optionText;
            this.page = page;
        }

        public String getOptionText() {
            return optionText;
        }

        public Class<? extends AbstractPage> getPage() {
            if (page == AbstractPage.class) throw new NotImplementedException(
                    String.format("%s page is not implemented", this.optionText));
            return page;
        }
    }

}

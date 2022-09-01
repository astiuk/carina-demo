package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NewsfeedPageBase extends AbstractPage implements IMobileUtils {

    public NewsfeedPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickLikeButton();

    public abstract boolean isPostLiked();
}

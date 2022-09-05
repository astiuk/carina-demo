package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CommentsPageBase extends AbstractPage implements IMobileUtils {

    public CommentsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeComment(String comment);

    public abstract void clickCheckButton();

    public abstract boolean isCommentPresent(String comment);

    public abstract void deleteComment(String comment);
}

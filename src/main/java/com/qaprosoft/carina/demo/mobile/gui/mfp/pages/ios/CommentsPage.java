package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommentsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CommentsPageBase.class)
public class CommentsPage extends CommentsPageBase {

    public CommentsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeComment(String comment) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickCheckButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isCommentPresent(String comment) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void deleteComment(String comment) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

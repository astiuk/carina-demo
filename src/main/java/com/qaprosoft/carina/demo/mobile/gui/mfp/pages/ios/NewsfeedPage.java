package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsfeedPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NewsfeedPageBase.class)
public class NewsfeedPage extends NewsfeedPageBase {

    public NewsfeedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickLikeButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isPostLiked() {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.BottomNavigatorButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommonPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserLoggedIn(String username) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public AbstractPage clickBottomNavigatorButton(BottomNavigatorButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void clickCloseModalButton() {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public boolean isItemByTextPresent(String text) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void SwipeToElementByText(String text) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

}

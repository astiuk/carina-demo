package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.MyItemsCreateButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MyItemsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyItemsPageBase.class)
public class MyItemsPage extends MyItemsPageBase {

    public MyItemsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage clickCreateButton(MyItemsCreateButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public String getItemTitle(MyItemsCreateButtons button) {
        throw new NotImplementedException("Method is not implement for IOS");
    }

    @Override
    public void createFoodWithParameters(String brandName,
                                         String description,
                                         int servingSize,
                                         String servingSizeUnits,
                                         int servingsPerContainer,
                                         double calories) {
        throw new NotImplementedException("Method is not implement for IOS");
    }
}

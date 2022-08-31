package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.MyItemsCreateButtons;
import org.openqa.selenium.WebDriver;

public abstract class MyItemsPageBase extends AbstractPage {

    public MyItemsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage clickCreateButton(MyItemsCreateButtons button);

    public abstract String getItemTitle(MyItemsCreateButtons button);

    public abstract void createFoodWithParameters(String brandName,
                                                  String description,
                                                  int servingSize,
                                                  String servingSizeUnits,
                                                  int servingsPerContainer,
                                                  double calories);
}

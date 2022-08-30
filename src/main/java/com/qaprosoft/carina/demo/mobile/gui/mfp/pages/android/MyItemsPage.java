package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.enums.MyItemsCreateButtons;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MyItemsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyItemsPageBase.class)
public class MyItemsPage extends MyItemsPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/%s']//android.widget.Button")
    private ExtendedWebElement createButton;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/%s']//android.widget.TextView")
    private ExtendedWebElement itemTitle;

    public MyItemsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage clickCreateButton(MyItemsCreateButtons button) {
        createButton.format(button.getRecourseId()).click(3);
        return initPage(getDriver(), button.getPage());
    }

    @Override
    public String getItemTitle(MyItemsCreateButtons button) {
        return itemTitle.format(button.getRecourseId()).getText();
    }

    @Override
    public boolean isPageOpened() {
        return itemTitle.format(MyItemsCreateButtons.MEALS.getRecourseId()).isPresent(3);
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.enums.PremiumOptions;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.MyPremiumToolsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyPremiumToolsPageBase.class)
public class MyPremiumToolsPage extends MyPremiumToolsPageBase {

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement elementByText;

    public MyPremiumToolsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPremiumOptionTitlePresent(PremiumOptions premiumOption) {
        swipe(elementByText.format(premiumOption.getOptionTitle()), Direction.VERTICAL, 5, 1000);
        return elementByText.format(premiumOption.getOptionTitle()).isPresent(3);
    }

    @Override
    public boolean isPremiumOptionDescriptionPresent(PremiumOptions premiumOption) {
        swipe(elementByText.format(premiumOption.getOptionDescription()), Direction.VERTICAL, 5, 1000);
        return elementByText.format(premiumOption.getOptionDescription()).isPresent(3);
    }
}

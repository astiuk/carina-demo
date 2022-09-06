package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.enums.NewsFeedSharingCheckboxes;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsFeedSharingPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.SharingAndPrivacySettingsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsFeedSharingPageBase.class)
public class NewsFeedSharingPage extends NewsFeedSharingPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/*[@text='News Feed Sharing']")
    private ExtendedWebElement newsfeedSharingTitle;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/android.widget.ImageButton")
    private ExtendedWebElement backArrowButton;

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement newsfeedSharingCheckbox;

    public NewsFeedSharingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkCheckbox(NewsFeedSharingCheckboxes checkbox) {
        swipe(newsfeedSharingCheckbox.format(checkbox.getCheckboxText()), Direction.VERTICAL, 3, 500);
        newsfeedSharingCheckbox.format(checkbox.getCheckboxText()).check();
    }

    @Override
    public void uncheckCheckbox(NewsFeedSharingCheckboxes checkbox) {
        swipe(newsfeedSharingCheckbox.format(checkbox.getCheckboxText()), Direction.VERTICAL, 3, 500);
        newsfeedSharingCheckbox.format(checkbox.getCheckboxText()).uncheck();
    }

    @Override
    public boolean isCheckboxChecked(NewsFeedSharingCheckboxes checkbox) {
        swipe(newsfeedSharingCheckbox.format(checkbox.getCheckboxText()), Direction.VERTICAL, 3, 500);
        return newsfeedSharingCheckbox.format(checkbox.getCheckboxText()).isChecked();
    }

    @Override
    public SharingAndPrivacySettingsPageBase returnToPreviousPage() {
        backArrowButton.click(3);
        return initPage(getDriver(), SharingAndPrivacySettingsPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return newsfeedSharingTitle.isPresent(3);
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.QuickAddPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = QuickAddPageBase.class)
public class QuickAddPage extends QuickAddPageBase {

    @ExtendedFindBy(accessibilityId = "NO THANKS")
    private ExtendedWebElement noThanksButton;

    @FindBy(id = "com.myfitnesspal.android:id/%s")
    private ExtendedWebElement quickAddField;

    public QuickAddPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void fillAllFields(int fat, int carbs, int protein) {
        if(noThanksButton.isPresent(3)) noThanksButton.click(3);
        quickAddField.format(QuickAddFields.FAT.getFieldId()).type(String.valueOf(fat), 3);
        quickAddField.format(QuickAddFields.CARBS.getFieldId()).type(String.valueOf(carbs), 3);
        quickAddField.format(QuickAddFields.PROTEIN.getFieldId()).type(String.valueOf(protein), 3);
    }

    @Override
    public int getCalories() {
        return Integer.parseInt(quickAddField.format(QuickAddFields.CALORIES.getFieldId()).getText());
    }

    public enum QuickAddFields {
        CALORIES("tvQuickCalories"),
        FAT("tvQuickFat"),
        CARBS("tvQuickCarbs"),
        PROTEIN("tvQuickProtein");

        private String fieldId;

        QuickAddFields(String field) {
            this.fieldId = field;
        }

        public String getFieldId() {
            return fieldId;
        }
    }
}

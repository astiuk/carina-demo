package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.EditDiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.QuickAddPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase {

    @ExtendedFindBy(accessibilityId = "View Nutrition")
    private ExtendedWebElement viewNutrition;

    @ExtendedFindBy(accessibilityId = "Edit Diary")
    private ExtendedWebElement editDiaryButton;

    @FindBy(id = "com.myfitnesspal.android:id/goal")
    private ExtendedWebElement goalCalories;

    @FindBy(id = "com.myfitnesspal.android:id/remaining_diary")
    private ExtendedWebElement remainCalories;

    @FindBy(xpath = "(//android.widget.Button[@text='ADD FOOD'])[%d]")
    private ExtendedWebElement addFoodButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Quick Add']")
    private ExtendedWebElement quickAddButton;

    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isDiaryClean() {
        return !editDiaryButton.isPresent(1);
    }

    @Override
    public void clearDiary() {
        if(!isDiaryClean())
        {
            editDiaryButton.click(3);
            EditDiaryPageBase editDiaryPage = initPage(getDriver(), EditDiaryPageBase.class);
            editDiaryPage.clearAll();
        }
    }

    @Override
    public int getGoalCalories() {
        String calories = goalCalories.getText();
        return Integer.parseInt(calories.replace(",", ""));
    }

    @Override
    public int getRemainCalories() {
        String calories = remainCalories.getText();
        return Integer.parseInt(calories.replace(",", ""));
    }

    @Override
    public QuickAddPageBase openQuickAddPage(Meals meal) {
        addFoodButton.format(meal.getMealNumber()).click(3);
        quickAddButton.click(3);
        return initPage(getDriver(), QuickAddPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return viewNutrition.isPresent(3);
    }
}

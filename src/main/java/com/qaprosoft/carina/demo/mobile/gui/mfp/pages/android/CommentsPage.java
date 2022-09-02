package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommentsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommentsPageBase.class)
public class CommentsPage extends CommentsPageBase {

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/toolbar']/*[@text='Comments']")
    private ExtendedWebElement commentsTitle;

    @FindBy(id = "com.myfitnesspal.android:id/inputComment")
    private ExtendedWebElement commentField;

    @ExtendedFindBy(accessibilityId = "Post")
    private ExtendedWebElement checkButton;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/textStatusText' and @text='%s']")
    private ExtendedWebElement commentText;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/textStatusText' and @text='%s']/parent::*")
    private ExtendedWebElement commentContainer;

    @FindBy(id = "com.myfitnesspal.android:id/text")
    private ExtendedWebElement deleteCommentButton;

    public CommentsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeComment(String comment) {
        commentField.type(comment, 3);
    }

    @Override
    public void clickCheckButton() {
        checkButton.click(3);
    }

    @Override
    public boolean isCommentPresent(String comment) {
        swipe(commentText.format(comment), Direction.VERTICAL, 5, 500);
        return commentText.format(comment).isPresent(3);
    }

    @Override
    public void deleteComment(String comment) {
        longTap(commentContainer.format(comment));
        deleteCommentButton.click(3);
    }

    @Override
    public boolean isPageOpened() {
        return commentsTitle.isPresent(3);
    }
}

package com.qaprosoft.carina.demo.mobile.gui.mfp.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CommentsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.NewsfeedPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsfeedPageBase.class)
public class NewsfeedPage extends NewsfeedPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/imageCameraButton")
    private ExtendedWebElement cameraButton;

    @FindBy(xpath = "(//*[@resource-id='com.myfitnesspal.android:id/textLikeButton'])[1]")
    private ExtendedWebElement likeButton;

    @FindBy(xpath = "(//*[@resource-id='com.myfitnesspal.android:id/textButtonComment'])[1]")
    private ExtendedWebElement commentButton;

    @FindBy(xpath = "//androidx.cardview.widget.CardView[.//*[contains(@text,'MyFitnessPal Blog')] and " +
            ".//*[contains(@resource-id,'imageBlog')]]")
    private ExtendedWebElement mfpArticleCard;

    public NewsfeedPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickLikeButton() {
        swipe(likeButton, Direction.VERTICAL, 10, 500);
        likeButton.click(3);
    }

    @Override
    public boolean isPostLiked() {
        return Boolean.parseBoolean(likeButton.getAttribute("selected"));
    }

    @Override
    public CommentsPageBase clickCommentButton() {
        swipe(commentButton, Direction.VERTICAL, 10, 500);
        commentButton.click(3);
        return initPage(getDriver(), CommentsPageBase.class);
    }

    @Override
    public boolean isMFPArticleBlogPresent() {
        swipe(mfpArticleCard, Direction.UP, 10, 500);
        return mfpArticleCard.isPresent(3);
    }

    @Override
    public boolean isPageOpened() {
        return cameraButton.isPresent();
    }
}

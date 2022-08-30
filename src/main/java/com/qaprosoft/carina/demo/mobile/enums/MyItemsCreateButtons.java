package com.qaprosoft.carina.demo.mobile.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.mfp.pages.common.CreateFoodPageBase;
import org.apache.commons.lang3.NotImplementedException;

public enum MyItemsCreateButtons {
    MEALS("meals", AbstractPage.class),
    RECIPES("recipes", AbstractPage.class),
    FOODS("foods", CreateFoodPageBase.class),
    CARDIO("cardio", AbstractPage.class),
    STRENGTH("strength", AbstractPage.class);

    private String recourseId;
    private Class<? extends AbstractPage> page;

    MyItemsCreateButtons(String recourseId, Class<? extends AbstractPage> page) {
        this.recourseId = recourseId;
        this.page = page;
    }

    public String getRecourseId() {
        return recourseId;
    }

    public Class<? extends AbstractPage> getPage() {
        if (page == AbstractPage.class) throw new NotImplementedException(
                String.format("%s page is not implemented", this.recourseId));
        return page;
    }
}

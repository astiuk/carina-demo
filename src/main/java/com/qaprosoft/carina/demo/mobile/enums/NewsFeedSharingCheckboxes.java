package com.qaprosoft.carina.demo.mobile.enums;

public enum NewsFeedSharingCheckboxes {
    NEW_ARTICLES_FORM_MFP_BLOG("There are new articles from the MyFitnessPal blog");

    private String checkboxText;

    NewsFeedSharingCheckboxes(String checkboxText) {
        this.checkboxText = checkboxText;
    }

    public String getCheckboxText() {
        return checkboxText;
    }
}

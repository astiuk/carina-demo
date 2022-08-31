package com.qaprosoft.carina.demo.mobile.enums;

public enum EndPlanReasons {
    I_WANT_TO_RESTART_THE_PLAN("I want to restart the plan."),
    OTHER_PRIORITIES_IN_LIFE("Other priorities in my life took precedent."),
    I_WANT_TO_START_DIFFERENT_PLAN("I want to start a different plan."),
    THE_PLAN_WASNT_HELPFUL("The plan wasn’t helpful to me."),
    JUST_WANTED_TO_WHAT_THIS_PLAN_ABOUT("I just wanted to see what the plan was about."),
    THE_PLAN_WAS_TOO_HARD("The plan was too hard to follow."),
    WASNT_WHAT_I_EXPECTED("The plan wasn’t what I expected."),
    I_LOST_INTEREST("I lost interest."),
    I_FORGOT_ABOUT_IT("I forgot about it.");

    private String reasonText;

    EndPlanReasons(String reasonText) {
        this.reasonText = reasonText;
    }

    public String getReasonText() {
        return reasonText;
    }
}

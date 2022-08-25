package com.qaprosoft.carina.demo.mobile.enums;

public enum PlanFilterRadioButtons {
    FREE("Free", new AvailablePlans[]{
            AvailablePlans.MY_FITNESS_PAL_101,
            AvailablePlans.EAT_GREEN,
            AvailablePlans.SIMPLE_START_CHALLENGE,
            AvailablePlans.MINDFUL_MOTIVATED
    }),
    MEAL_PLAN("Meal Plan", new AvailablePlans[]{
            AvailablePlans.LOW_CARB,
            AvailablePlans.HIGH_PROTEIN
    }),
    NUTRITION("Nutrition", new AvailablePlans[]{
            AvailablePlans.SUPPORT_YOUR_IMMUNE_SYSTEM,
            AvailablePlans.REACHING_YOUR_CALORIE_GOALS,
            AvailablePlans.BUILDING_HEALTHY_HABITS,
            AvailablePlans.EAT_GREEN,
            AvailablePlans.SIMPLE_START_CHALLENGE,
            AvailablePlans.HEALTHY_KICKSTART,
            AvailablePlans.MINDFUL_MOTIVATED,
            AvailablePlans.INTRO_TO_MACRO_TRACKING
    }),
    WALKING("Walking", new AvailablePlans[]{
            AvailablePlans.ELEVEN_THOUSAND_STEPS_A_DAY,
            AvailablePlans.NINE_THOUSAND_STEPS_A_DAY,
            AvailablePlans.SIX_THOUSAND_STEPS_A_DAY
    }),
    WORKOUT("Workout", new AvailablePlans[]{
            AvailablePlans.TOTAL_BODY_POWER,
            AvailablePlans.PROGRESSIVE_BODYWEIGHT,
            AvailablePlans.STRONG_GLUTES_THIGHS,
            AvailablePlans.PROGRESSIVE_DUMBBELL,
            AvailablePlans.TONED_UPPER_BODY,
            AvailablePlans.LOW_IMPACT_STRENGTH,
            AvailablePlans.CORE_PLUS
    });

    private String buttonText;
    private AvailablePlans[] filterPlans;

    PlanFilterRadioButtons(String buttonText, AvailablePlans[] filterPlans) {
        this.buttonText = buttonText;
        this.filterPlans = filterPlans;
    }

    public String getButtonText() {
        return buttonText;
    }

    public AvailablePlans[] getFilterPlans() {
        return filterPlans;
    }
}

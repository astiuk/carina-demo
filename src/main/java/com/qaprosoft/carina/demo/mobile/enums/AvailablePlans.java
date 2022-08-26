package com.qaprosoft.carina.demo.mobile.enums;

import java.util.HashMap;
import java.util.Map;

public enum AvailablePlans {
    LOW_IMPACT_STRENGTH("Low Impact Strength", "28 days • 3x a week"),
    HIGH_PROTEIN("High Protein", "28 days • Daily"),
    LOW_CARB("Low Carb", "28 days • Daily"),
    CORE_PLUS("Core Plus", "28 days • 2-4x a week"),
    MY_FITNESS_PAL_101("MyFitnessPal 101", "7 days • Daily"),
    SIX_THOUSAND_STEPS_A_DAY("6,000 Steps a Day", "28 days • Daily"),
    SIMPLE_START_CHALLENGE("Simple Start Challenge", "Simple Start Challenge"),
    PROGRESSIVE_BODYWEIGHT("Progressive Bodyweight", "28 days • 6-7x a week"),
    TONED_UPPER_BODY("Toned Upper Body", "28 days • 2-4x a week"),
    STRONG_GLUTES_THIGHS("Strong Glutes & Thighs ", "28 days • 2-4x a week"),
    INTRO_TO_MACRO_TRACKING("Intro to Macro Tracking", "28 days • Daily"),
    TOTAL_BODY_POWER("Total Body Power", "28 days • 4x a week"),
    ELEVEN_THOUSAND_STEPS_A_DAY("11,000 Steps a Day", "28 days • Daily"),
    PROGRESSIVE_DUMBBELL("Progressive Dumbbell", "14 days • 6x a week"),
    EAT_GREEN("Eat Green", "14 days • Daily"),
    BUILDING_HEALTHY_HABITS("Building Healthy Habits", "28 days • Daily"),
    REACHING_YOUR_CALORIE_GOALS("Reaching Your Calorie Goal", "28 days • Daily"),
    MINDFUL_MOTIVATED("Mindful + Motivated", "14 days • Daily"),
    HEALTHY_KICKSTART("Healthy Kickstart", "28 days • Daily"),
    SUPPORT_YOUR_IMMUNE_SYSTEM("Support Your Immune System", "14 days • Daily"),
    NINE_THOUSAND_STEPS_A_DAY("9,000 Steps a Day", "28 days • Daily");

    private String planName;
    private String planDetails;

    private static final Map<String, AvailablePlans> lookup = new HashMap<String, AvailablePlans>();

    static {
        for (AvailablePlans d : AvailablePlans.values()) {
            lookup.put(d.getPlanName(), d);
        }
    }

    AvailablePlans(String planName, String planDetails) {
        this.planName = planName;
        this.planDetails = planDetails;
    }

    public String getPlanName() {
        return planName;
    }

    public String getPlanDetails() {
        return planDetails;
    }

    public static AvailablePlans getPlanByName(String name) {
        return lookup.get(name);
    }
}

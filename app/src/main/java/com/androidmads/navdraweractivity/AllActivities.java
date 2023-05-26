package com.androidmads.navdraweractivity;

public final class AllActivities {
    public static final java.util.HashMap<Integer, Class> classMap = new java.util.HashMap<Integer, Class>();
    
    static {
        classMap.put(R.id.nav_activity1, FirstActivity.class);
        classMap.put(R.id.nav_activity2, SecondActivity.class);
    }

    private AllActivities() {
        // constructor should not be invoked
    }
}

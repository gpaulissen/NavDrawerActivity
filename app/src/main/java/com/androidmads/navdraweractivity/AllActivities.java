package com.androidmads.navdraweractivity;

import java.util.HashMap;

public final class AllActivities {
    public static final HashMap<Integer, Class> classMap = new HashMap<Integer, Class>();
    
    static {
        classMap.put(R.id.nav_activity1, FirstActivity.class);
        classMap.put(R.id.nav_activity2, SecondActivity.class);
    }

    private AllActivities() {
        // constructor should not be invoked
    }
}

package com.dsa.practices.dec2024.dec27.singleton;


/*
    An eager singleton creates the instance at the time of class loading.
    Definition: The instance is created as soon as the class is loaded into memory,
                regardless of whether it is actually used.

    Key Points:
    Advantage: Simple and thread-safe since the instance is created at class loading.
    Disadvantage: Wastes resources if the instance is never used.

 */
public class LagerSingletonClass {
    private static final LagerSingletonClass instance = new LagerSingletonClass();

    private LagerSingletonClass() {
    }

    public static LagerSingletonClass getInstance() {
        return instance;
    }
}

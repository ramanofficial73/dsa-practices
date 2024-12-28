package com.dsa.practices.dec2024.dec27.singleton;

import java.io.Serializable;

/*
    A lazy singleton delays the creation of the instance until it is accessed for the first time.
    Definition: The instance is not created during class loading but only when the getInstance()
                method is called for the first time.

    Characteristics:
    Initialization: Instance is created only when getInstance is called.
    Thread Safety: Not thread-safe by default. Multiple threads may create multiple instances
                    if accessed simultaneously.

 */
public class LazySingletonClass implements Serializable {
    private static LazySingletonClass instance = null;   // No instance initially

    private LazySingletonClass() {  // Private constructor to prevent instantiation
    }

    public static LazySingletonClass getInstance() {
        if (instance == null) {
            instance = new LazySingletonClass();   // Instance created only when needed
        }
        return instance;
    }
}

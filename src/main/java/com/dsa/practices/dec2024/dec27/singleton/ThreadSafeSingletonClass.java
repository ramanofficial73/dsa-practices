package com.dsa.practices.dec2024.dec27.singleton;


/*
    A thread-safe singleton ensures that only one instance is created in multithreaded environments.

    Types of Implementation:
    A. Synchronized Method: Synchronizes the getInstance() method to ensure only
                            one thread creates the instance.
        Advantage: Thread-safe.
        Disadvantage: Slower performance due to method synchronization.

    B. Double-Checked Locking: Reduces synchronization overhead by checking twice before
                        creating the instance.
        Advantage: Thread-safe and efficient.
        Disadvantage: Slightly more complex implementation.

 */
public class ThreadSafeSingletonClass {

    /* Synchronized Method: */
    private static ThreadSafeSingletonClass instance = null;

    private ThreadSafeSingletonClass() {
    }

    public static synchronized ThreadSafeSingletonClass getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonClass();
        }
        return instance;
    }


    /* Double-Checked Locking */
    /*
    private static volatile ThreadSafeSingletonClass instance = null;

    private ThreadSafeSingletonClass() {
    }
    public static ThreadSafeSingletonClass getInstance() {
        if (instance== null) {   // First check
            synchronized (ThreadSafeSingletonClass.class) {
                if (instance == null){   // Second check
                    instance = new ThreadSafeSingletonClass();
                }
            }
        }
        return instance;

    }*/
}

package com.dsa.practices.desginPattern;

public class SingletonDesignPattern {

    // Step 1: Create a private static instance of the class
    private static SingletonDesignPattern instance;

    // Step 2: Make constructor private so that new cannot be used
    private SingletonDesignPattern() {
    }

    // Type - Provide a public method to return the instance
    public static SingletonDesignPattern getInstance() {
        if (instance == null) {        // lazy initialization
            instance = new SingletonDesignPattern();
        }
        return instance;
    }

    /*
    // Type - synchronized makes this thread-safe
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    */

    /*
    // Type - Double-Checked Locking (better performance)
    public static Singleton getInstance() {
        if (instance == null) {  // first check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) {  // second check (with lock)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    */

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        SingletonDesignPattern obj1 = SingletonDesignPattern.getInstance();
        SingletonDesignPattern obj2 = SingletonDesignPattern.getInstance();

        System.out.println(obj1 == obj2);  // true → both are same instance
    }
}

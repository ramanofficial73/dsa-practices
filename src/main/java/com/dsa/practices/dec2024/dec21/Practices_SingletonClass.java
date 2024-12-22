package com.dsa.practices.dec2024.dec21;

public class Practices_SingletonClass {
    private static final Practices_SingletonClass instance = new Practices_SingletonClass();

    Practices_SingletonClass() {
    }

    public static Practices_SingletonClass getInstance() {
        return instance;
    }
}

package com.dsa.practices.dec2024.dec21;

public class SingletonClass {
    private static final SingletonClass instance = new SingletonClass();

    SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return instance;
    }
}

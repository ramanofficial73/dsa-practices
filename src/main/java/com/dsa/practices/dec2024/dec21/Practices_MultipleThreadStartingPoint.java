package com.dsa.practices.dec2024.dec21;

public class Practices_MultipleThreadStartingPoint {
    public static void main(String[] args) {
        Practices_RunMultipleThread thread1 = new Practices_RunMultipleThread("Thread1");
        Practices_RunMultipleThread thread2 = new Practices_RunMultipleThread("Thread2");
        Practices_RunMultipleThread thread3 = new Practices_RunMultipleThread("Thread3");
        Practices_RunMultipleThread thread4 = new Practices_RunMultipleThread("Thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

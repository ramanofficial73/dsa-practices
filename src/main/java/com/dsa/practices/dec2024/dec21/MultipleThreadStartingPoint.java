package com.dsa.practices.dec2024.dec21;

public class MultipleThreadStartingPoint {
    public static void main(String[] args) {
        RunMultipleThread thread1 = new RunMultipleThread("Thread1");
        RunMultipleThread thread2 = new RunMultipleThread("Thread2");
        RunMultipleThread thread3 = new RunMultipleThread("Thread3");
        RunMultipleThread thread4 = new RunMultipleThread("Thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

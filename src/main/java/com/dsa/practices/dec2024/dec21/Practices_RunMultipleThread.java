package com.dsa.practices.dec2024.dec21;

public class Practices_RunMultipleThread extends Thread {

    Practices_RunMultipleThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " +
                Thread.currentThread().getId() + " is executing.");
    }
}

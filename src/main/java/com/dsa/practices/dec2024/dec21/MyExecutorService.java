package com.dsa.practices.dec2024.dec21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println(
                Thread.currentThread().getName() + "executing")
        );
        executorService.submit(() -> System.out.println(
                Thread.currentThread().getName() + "executing")
        );
        executorService.submit(() -> System.out.println(
                Thread.currentThread().getName() + "executing")
        );
        executorService.shutdown();
    }
}

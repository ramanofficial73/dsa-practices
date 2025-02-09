package com.dsa.practices.recursion;

public class Question_Recursion_FibonacciSeries {
    /*
    What is the Fibonacci Series?
    The Fibonacci series is a sequence of numbers where:
    1. Each number is the sum of the two preceding ones.
    2. The first two numbers are 0 and 1.

    Mathematical Formula:
    F(n) = F(n−1) + F(n−2)

    with base cases:
    F(0) = 0, F(1) = 1

    Example of Fibonacci Series:
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...


    */
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        /* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... */
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

package com.dsa.practices.basic;

public class PrintAllDivisionsNumbers {
    public static void main(String[] args) {
        int n = 500;
        getDivisionNumbers(n);
    }

    /* Time Complexity - O(n) */
    private static void getDivisionNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}

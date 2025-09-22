package com.dsa.practices.basic;

public class CountPrimesNumbers {

    public static void main(String[] args) {
        System.out.println(countPrimes(2));
    }
    public static int countPrimes(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (i < n && n % i == 0) {
                counter++;
            }
        }
        return counter;
    }
}

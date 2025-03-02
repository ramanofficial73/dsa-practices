package com.dsa.practices.recursion;

public class Questions_PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                } else {
                    j++;
                }
            }
            if (i == j) {
                System.out.println(i + " ");
            }
        }
    }
}

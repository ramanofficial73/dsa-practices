package com.dsa.practices.basic;

public class PrintAllDivisionsNumbers {
    public static void main(String[] args) {
        int n = 500;
//        getDivisionNumbers(n);
        getDivisionNumbersWithOSqrtN(n);
    }

    /* Time Complexity - O(n) */
    private static void getDivisionNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    /* Time Complexity - (O(√n) */
    private static void getDivisionNumbersWithOSqrtN(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                if (i != num / i) {
                    System.out.print(num / i + " ");
                }
            }
        }
    }
}

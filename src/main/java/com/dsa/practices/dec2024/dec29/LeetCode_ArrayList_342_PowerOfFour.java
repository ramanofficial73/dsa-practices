package com.dsa.practices.dec2024.dec29;

public class LeetCode_ArrayList_342_PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(20));
    }

    public static boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        }

        while (n % 4 == 0) {
            n = n / 4;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}

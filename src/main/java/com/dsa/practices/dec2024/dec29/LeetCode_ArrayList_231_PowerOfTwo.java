package com.dsa.practices.dec2024.dec29;

public class LeetCode_ArrayList_231_PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(10));
    }

    public static boolean isPowerOfThree(int n) {
        if (n < 0) {
            return false;
        } else if (n == 1) {
            return true;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}

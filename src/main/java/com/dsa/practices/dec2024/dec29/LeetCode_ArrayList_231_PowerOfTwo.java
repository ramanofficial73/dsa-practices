package com.dsa.practices.dec2024.dec29;

public class LeetCode_ArrayList_231_PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}

package com.dsa.practices.dec2024.dec31;

public class LeetCode_ArrayList_66_PlusOne {
    public static void main(String[] args) {
        int[] data = {1,2,3};
        System.out.println(plusOne(data));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        if (digits[n-1] != 9) {
            digits[n-1] = digits[n-1] + 1;
            return digits;
        }

        digits[n-1] = 0;
        for (int i =n-2; i>=0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;

            }
            digits[i] = 0;
        }
        int[] ans = new int[n +1];
        ans[0] = 1;
        return ans;
    }
}

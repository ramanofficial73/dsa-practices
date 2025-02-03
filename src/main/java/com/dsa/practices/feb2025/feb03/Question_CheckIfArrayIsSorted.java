package com.dsa.practices.feb2025.feb03;

public class Question_CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 5, 6, 2};
        System.out.println(isSorted(data));

    }

    static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
            } else {
                return false;
            }
        }
        return true;
    }
}

package com.dsa.practices.jan2025.jan13;

public class LeetCode_283_MoveZeroes {
    public static void main(String[] args) {
        int[] data = {0, 1, 3, 5, 0, 4};
        moveZeroes(data);

        System.out.println(data);
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

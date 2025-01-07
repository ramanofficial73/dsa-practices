package com.dsa.practices.jan2024.jan07;

public class LeetCode_724_FindPivotIndex {
    public static void main(String[] args) {
        int[] data = {1, 7, 3, 6, 5, 6};
        /* Pivot element is left of the array sum and right array of the sum of the index */
        System.out.println(pivotIndex(data));
    }

    public static int pivotIndex(int[] nums) {
        int lSum = 0;
        int rSum = 0;
        int index = -1;
        for (int num : nums) {
            rSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            rSum = rSum - nums[i];
            if (rSum == lSum) {
                return i;
            }
            lSum += nums[i];
        }
        return index;
    }
}

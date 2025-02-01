package com.dsa.practices.jan2025.jan04;

public class LeetCode_ArrayList_1800MaximumAscendingSubarraySum {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 5, 10, 50};
        System.out.println(maxAscendingSum(data));
    }

    public static int maxAscendingSum(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                currSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, currSum);
                currSum = nums[i];
            }
        }
        maxSum = Math.max(maxSum, currSum);
        return maxSum;
    }
}

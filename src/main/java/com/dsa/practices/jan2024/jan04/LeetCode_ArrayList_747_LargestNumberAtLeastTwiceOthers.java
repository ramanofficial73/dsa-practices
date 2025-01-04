package com.dsa.practices.jan2024.jan04;

public class LeetCode_ArrayList_747_LargestNumberAtLeastTwiceOthers {
    public static void main(String[] args) {
        int[] data = {3,6,1,0};
        System.out.println(dominantIndex(data));
    }

    public static int dominantIndex(int[] nums) {
        int maxValue = 0;
        int index = -1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                index = i;
            }
        }
        for (int m : nums) {
            if (maxValue < 2 * m && maxValue != m) {
                return -1;
            }
        }
        return index;
    }
}

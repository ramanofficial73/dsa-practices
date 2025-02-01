package com.dsa.practices.jan2025.jan12;

import java.util.Arrays;

public class LeetCode_217_ContainsDuplicate {
    public static void main(String[] args) {
        int[] da = {1, 4, 3, 2, 1};
        System.out.println(containsDuplicate(da));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

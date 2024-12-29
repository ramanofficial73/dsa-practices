package com.dsa.practices.dec2024.dec29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_ArrayList_18_4Sum {
    public static void main(String[] args) {
        int[] data = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(data, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalResult = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            /* Same as 3 Sum logic */
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    long expectedResult = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (expectedResult < target) {
                        k++;
                    } else if (expectedResult > target) {
                        l--;
                    } else {
                        finalResult.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                    }
                }
            }
        }
        return finalResult;
    }
}

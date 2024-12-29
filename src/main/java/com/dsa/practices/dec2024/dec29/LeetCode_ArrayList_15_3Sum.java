package com.dsa.practices.dec2024.dec29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode_ArrayList_15_3Sum {
    public static void main(String[] args) {
        /* Output: [[-1,-1,2],[-1,0,1]] */
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalResult = new ArrayList<>();
        /*
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int expectedOutput = nums[i] + nums[j] + nums[k];
                    if (expectedOutput == 0) {
                        List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                        Collections.sort(result);
                        if (!finalResult.contains(result)) {
                            finalResult.add(result);
                        }
                    }
                }
            }
        }
        return finalResult;
        */

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (j < k) {
                int expectedResult = nums[i] + nums[j] + nums[k];
                if (expectedResult < 0) {
                    j++;
                } else if (expectedResult > 0) {
                    k--;
                } else {
                    finalResult.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                }
            }
        }
        return finalResult;
    }
}

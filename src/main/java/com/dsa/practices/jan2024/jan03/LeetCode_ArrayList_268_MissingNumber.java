package com.dsa.practices.jan2024.jan03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCode_ArrayList_268_MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int range = nums.length;
        int actualSum = (range * (range + 1))/2;
        int currentSum = 0;
        for (int num: nums) {
            currentSum += num;
        }
        int ans = actualSum - currentSum;
        return ans;

        /*
        int length = nums.length;
        int i = 0;
        List<Integer> data = IntStream.of(nums).boxed()
                .collect(Collectors.toList());
        for (i = 0; i <= length; i++) {
            if (!data.contains(i)) {
                return i;
            }
        }
        return i;
        */
    }
}

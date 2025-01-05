package com.dsa.practices.jan2024.jan05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_ArrayList_2089_FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] data ={1,2,5,2,3};
        System.out.println(targetIndices(data, 3));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                res.add(i);
            }
        }
        return res;
    }
}

package com.dsa.practices.arrayList;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}

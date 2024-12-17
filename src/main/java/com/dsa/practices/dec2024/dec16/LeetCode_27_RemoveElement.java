package com.dsa.practices.dec2024.dec16;

import java.util.Arrays;

public class LeetCode_27_RemoveElement {
    public static void main(String[] args) {
        int[] data = {3,2,2,3};
        int val = 3;
        System.out.println("Original list : " + Arrays.toString(data));
        System.out.println("After removing target element list size : " + getRemoveElementList(data, val));
    }

    private static int getRemoveElementList(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

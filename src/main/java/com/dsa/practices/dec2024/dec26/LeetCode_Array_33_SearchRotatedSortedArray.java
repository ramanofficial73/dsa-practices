package com.dsa.practices.dec2024.dec26;

public class LeetCode_Array_33_SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] data ={1};
        System.out.println(search(data, 1));
    }

    public static int search(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

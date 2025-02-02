package com.dsa.practices.feb2025.feb02;

public class LeetCode_35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] data = {1,3,5,6};
        System.out.println(searchInsert(data, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}

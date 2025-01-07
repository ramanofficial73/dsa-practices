package com.dsa.practices.jan2024.jan07;

public class LeetCode_33_SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] data = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(data, 1));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (nums[start] <= nums[mid]) {   //first part is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = end - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

package com.dsa.practices.jan2024.jan06;

public class LeetCode_ArrayList_704_BinarySearch {
    public static void main(String[] args) {
        int[] data = {-1,0,3,5,9,12};
        System.out.println(search(data, 2));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
            int mid = (start+end)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target ){
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}

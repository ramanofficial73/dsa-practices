package com.dsa.practices.jan2024.jan04;

public class LeetCode_ArrayList_334_IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] data = {20, 100, 10, 12, 5, 13};
        System.out.println(increasingTriplet(data));
    }

    public static boolean increasingTriplet(int[] nums) {
        /*for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] < nums[k]) {
                        return true;
                    }
                }
            }
        }*/

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if (first >= ele) {
                first = ele;
            } else if (second >= ele) {
                second = ele;
            } else {
                third = ele;
                return true;
            }
        }
        return false;
    }
}

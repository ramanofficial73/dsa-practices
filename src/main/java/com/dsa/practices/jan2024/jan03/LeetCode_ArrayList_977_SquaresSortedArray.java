package com.dsa.practices.jan2024.jan03;

public class LeetCode_ArrayList_977_SquaresSortedArray {
    public static void main(String[] args) {
        int[] data = {-7, -4, 3, 0, 1, 2};
        System.out.println(sortedSquares(data));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1;

        while (start <= end) {
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];

            if (ss > es) {
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}

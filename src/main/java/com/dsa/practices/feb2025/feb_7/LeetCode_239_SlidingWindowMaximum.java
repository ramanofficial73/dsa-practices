package com.dsa.practices.feb2025.feb_7;

import java.util.Arrays;

public class LeetCode_239_SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] daat = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] ints = maxSlidingWindow(daat, 3);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int z = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            ans[z++] = max;
        }
        return ans;
    }
}

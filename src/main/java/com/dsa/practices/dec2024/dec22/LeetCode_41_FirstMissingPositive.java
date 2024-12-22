package com.dsa.practices.dec2024.dec22;

import java.util.HashSet;

public class LeetCode_41_FirstMissingPositive {
    public static void main(String[] args) {
        int nums[] = {1,2,0};
        int num = getFirstMissingPositive(nums);
        System.out.println("Missing Smallest number : " + num);
    }

    private static int getFirstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return n + 1;
    }

    /*
    private static int getFirstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i]- 1] != nums[i]) {
                int j = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
    */
}

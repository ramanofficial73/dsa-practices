package com.dsa.practices.dec2024.dec29;

public class DSA_BruteForceAlgorithm {
    /*
     * A brute-force algorithm is a straightforward way to solve a problem by trying all possible
     * solutions until you find the correct one. It doesn't use any shortcuts or optimizations,
     * so it can be slow, especially for large problems.
     *
     * Brute-force is easy to understand and works for small problems,
     * but it’s not efficient for larger input sizes.
     *
     *
     * Given Problem: Find two numbers in an array that add up to a target.
     * Brute-Force Solution:
     * 1. Check every possible pair of numbers in the array.
     * 2. If their sum equals the target, return them.
     *
     * Explanation in Simple Words:
     * #1. Go through each number in the array.
     * #2. For each number, check all other numbers to see if their sum equals the target.
     * #3. If you find a match, return their positions.
     *
     * Time Complexity O(n^2):
     * – because we check every pair of numbers.
     */


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

package com.dsa.practices.jan2024.jan01;

public class LeetCode_ArrayList_167_TwoSumInputArrayIsSorted {
    public static void main(String[] args) {
        int[] data = {2, 7, 11, 15};
        System.out.println(twoSum(data, 9));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] ans = new int[2];
        while (start <= end) {
            int sum = numbers[start] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else if (sum == target) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            }
        }
        return ans;
    }
}

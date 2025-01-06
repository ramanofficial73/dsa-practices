package com.dsa.practices.jan2024.jan06;

public class LeetCode_ArrayList_2529_MaximumCountPositiveIntegerNegativeInteger {

    public static void main(String[] args) {
        int[] data = {-2, -1, -1, 1, 2, 3};
        System.out.println(maximumCount(data));
    }

    public static int maximumCount(int[] nums) {

        int lastNegative = getLastNegativeIndex(nums) + 1;
        int firstPositive = nums.length - getFirstPositiveIndex(nums);
        return Math.max(lastNegative, firstPositive);

        /*
        int posCounter = 0;
        int negCounter = 0;
        for (int num: nums) {
            if (num < 0) {
                negCounter++;
            } else  if (num > 0){
                posCounter++;
            }
        }

        return Math.max(negCounter, posCounter);
        */
    }

    private static int getLastNegativeIndex(int[] nums) {
        /*  {-3,-2,-1,0, 0,1,2} */
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < 0) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static int getFirstPositiveIndex(int[] nums) {
        /*  {-3,-2,-1,0, 0,1,2} */
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}

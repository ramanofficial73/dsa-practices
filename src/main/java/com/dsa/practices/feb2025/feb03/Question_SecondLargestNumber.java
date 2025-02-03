package com.dsa.practices.feb2025.feb03;

public class Question_SecondLargestNumber {
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 5, 6, 5};
//        int[] data = {1, 2, 2, 2, 2, 2};
        System.out.println(getSecondLarges(data));
    }

    /* Solution first */
    /*
    public static int getSecondLarges(int[] nums) {
        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (largest != nums[i]) {
                return nums[i];
            }
        }
        return largest;
    }
    */

    /*public static int getSecondLarges(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        int secLargest = -1;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (secLargest < nums[i] && nums[i] != largest) {
                secLargest = nums[i];
            }
        }
        return secLargest;
    }*/

    public static int getSecondLarges(int[] nums) {
        int largest = nums[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i <= nums.length - 1; i++) {
            if (largest < nums[i]) {
                secLargest = largest;
                largest = nums[i];
            }
        }
        return secLargest;
    }
}

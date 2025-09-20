package com.dsa.practices.arrayList;

import java.util.Arrays;

public class FindLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        getLargestElement(nums);
        getLargestElementWithOLogNTC(nums);
    }


    /* Get largest element in array with o(nlogn) time complexity */
    private static void getLargestElementWithOLogNTC(int[] nums) {
        int largest = nums[0];
        Arrays.sort(nums);
        System.out.println("Largest element in array : " + nums[nums.length - 1] + " with O(nlogn) time complexity");
    }

    /* Get largest element in array with o(n) time complexity */
    private static void getLargestElement(int[] nums) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        System.out.println("Largest element in array : " + largest + " with O(n) time complexity");
    }

}

package com.dsa.practices.arrayList;

import java.util.Arrays;

public class FindLargestElementInArrayWithKthPositions {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int n = 4;
        getLargestElement(nums, n);
        getLargestElementWithOLogNTC(nums, n);
    }


    /* Get largest element in array with o(nlogn) time complexity */
    private static void getLargestElementWithOLogNTC(int[] nums, int n) {
        Arrays.sort(nums);
        System.out.println("Largest element in array : " + nums[nums.length - n] + " with O(nlogn) time complexity");
    }

    //TODO: We have to solve this problem later
    /* Get largest element in array with o(n) time complexity */
    private static void getLargestElement(int[] nums, int n) {
        int largest = nums[n];
        for (int i = 0; i <nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        System.out.println("Largest element in array : " + largest + " with O(n) time complexity");
    }

}

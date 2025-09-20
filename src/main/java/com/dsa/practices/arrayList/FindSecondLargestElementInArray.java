package com.dsa.practices.arrayList;

import java.util.Arrays;

public class FindSecondLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 7, 7, 7, 7, 5};
        getSecondLargestElementWithOLogNTC(nums);
        getSecondLargestElement(nums);
    }


    /* Get the largest element in array with o(nlogn) + o(n) time complexity */
    private static void getSecondLargestElementWithOLogNTC(int[] nums) {
        Arrays.sort(nums);
        int secondLargest = nums[nums.length - 2];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (secondLargest != nums[i]) {
                secondLargest = nums[i];
                break;
            }
        }
        System.out.println("Second largest element in array : " + secondLargest + " with O(nlogn) time complexity");
    }

    /* Get the largest element in array with o(2n) time complexity */
    private static void getSecondLargestElement(int[] nums) {
        /*  {1, 7, 7, 7, 7, 5} */
        int largest = nums[0];
        for (int num : nums) {
            if (largest < num) {
                largest = num;
            }
        }

        int secondLargest = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > secondLargest && largest != nums[i]) {
                secondLargest = nums[i];
                break;
            }
        }
        System.out.println("Second largest element in array : " + secondLargest + " with O(2n) time complexity");
    }

}

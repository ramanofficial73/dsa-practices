package com.dsa.practices.arrayList;

import java.util.Arrays;

public class ArrayRotationByNthPlace {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int d = 6;
        int n = nums.length;
        d = d % n;

        int[] temp = new int[d];
        /* Here -> we ar story d place of element in temp array */
        for (int i = 0; i < d; i++) {
            temp[i] = nums[i];
        }

        /* Rotating after d place element */
        for (int i = d; i < n; i++) {
            nums[i - d] = nums[i];
        }

        /* Rotating d place element in main arrays */
        for (int i = n - d; i < n; i++) {
            nums[i] = temp[i - (n - d)];
        }

        System.out.println("Rotated arrays :" + Arrays.toString(nums));
    }
}

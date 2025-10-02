package com.dsa.practices.arrayList;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int nums[] = {1, 0, 4, 0, 6, 6, 0, 5};
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

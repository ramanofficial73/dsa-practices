package com.dsa.practices.dec2024.dec19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practices_ReverseArray {
    public static void main(String[] args) {
        int num[] = {2, 4, 21, 1, 11, 5, 7};
        System.out.println("Original Array : " + Arrays.toString(num));
        reverseArray(num);
        System.out.println("Reverse Array : " + Arrays.toString(num));
    }

    public static void reverseArray(int[] nums) {
        List<Integer> reverseArray = new ArrayList<>();
        int start = 0;
        int last = nums.length - 1;
        while (start < last) {
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            start++;
            last--;
        }
    }
}

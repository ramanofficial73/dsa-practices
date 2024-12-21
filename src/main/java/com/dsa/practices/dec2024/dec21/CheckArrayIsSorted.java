package com.dsa.practices.dec2024.dec21;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int num[] = {2, 4, 5, 7};
        System.out.println("Is sorted array : " + isSorted(num));
    }

    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

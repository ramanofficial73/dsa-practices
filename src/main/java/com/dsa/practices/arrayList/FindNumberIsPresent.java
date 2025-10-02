package com.dsa.practices.arrayList;

public class FindNumberIsPresent {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 4, 66, 78, 8};
        int element = 78;
        System.out.println("Element index: " +
                getElementIndex(nums, element));
    }

    private static int getElementIndex(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }
        return -1;
    }
}

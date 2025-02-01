package com.dsa.practices.jan2025.jan05;

import java.util.Arrays;

public class LeetCode_ArrayList_179_LargestNumber {
    public static void main(String[] args) {
        int[] data = {3,30,34,5,9};
        System.out.println(largestNumber(data));
    }

    public static String largestNumber(int[] nums) {
        String[] data = new String[nums.length];

        /* Converting into string */
        for (int i = 0; i < nums.length; i++) {
            data[i] = nums[i] + "";
        }

        /* Sorting as string*/
        Arrays.sort(data, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        /* adding in reverse order */
        StringBuilder builder = new StringBuilder("");
        for (int i = data.length - 1; i >= 0; i--) {
            builder.append(data[i]);
        }
        if (builder.charAt(0) == '0') {
            return "0";
        } else {
            return builder.toString();
        }
    }
}

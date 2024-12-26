package com.dsa.practices.dec2024.dec26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LeetCode_String_26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] num = {1,1,2};
        System.out.println(removeDuplicates(num));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int data: nums) {
            set.add(data);
        }
        return set.size();
    }
}

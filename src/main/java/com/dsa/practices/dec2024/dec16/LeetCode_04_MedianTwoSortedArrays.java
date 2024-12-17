package com.dsa.practices.dec2024.dec16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode_04_MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] n1 = {1, 2};
        int[] n2 = {3, 4};
        System.out.println(findMedianSortedArrays(n1, n2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> n1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> n2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> n3 = new ArrayList<>();
        n3.addAll(n1);
        n3.addAll(n2);

        List<Integer> finalSortedList = n3.stream().sorted().collect(Collectors.toList());
        int length = finalSortedList.size();
        if (length % 2 == 1) {
            return finalSortedList.get(length / 2);
        } else {
            Integer firstPart = finalSortedList.get((length / 2) - 1);
            Integer secondPart = finalSortedList.get(length / 2);
            return ((firstPart + secondPart) / 2.0);
        }
    }
}

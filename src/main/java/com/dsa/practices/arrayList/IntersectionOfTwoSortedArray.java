package com.dsa.practices.arrayList;

import java.util.*;

public class IntersectionOfTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        System.out.println("Size of intersection arrays : " + Arrays.toString(intersectionOfTwoArrayByBruteForce(arr1, arr2)));
    }

    public static int[] intersectionOfTwoArrayByBruteForce(int[] nums1, int[] nums2) {
        Set<Integer> intersection = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersection.add(nums1[i]);
                }

            }
        }
        List<Integer> arr = new ArrayList<>(intersection);
        int[] finalIn = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            finalIn[i] = arr.get(i);
        }
        return finalIn;
    }

}

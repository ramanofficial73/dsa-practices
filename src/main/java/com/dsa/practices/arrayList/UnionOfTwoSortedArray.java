package com.dsa.practices.arrayList;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArray {

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 4, 5, 6};
        int nums2[] = {2, 3, 4, 5, 6};

        System.out.println("Size of union arrays : " + unionOfTwoArrayByBruteForce(nums1, nums2));
    }

    public static int unionOfTwoArrayByBruteForce(int[] nums1, int[] nums2) {
        Set<Integer> union = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            union.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            union.add(nums2[i]);
        }

        return union.size();
    }
}

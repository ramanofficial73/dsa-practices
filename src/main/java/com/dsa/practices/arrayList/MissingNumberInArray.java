package com.dsa.practices.arrayList;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr1 = {3, 0 ,1};
        System.out.println("Missing number from the array : " + getMissingNumberFromArrayUsingBrouteForce(arr1));
    }

    public static int getMissingNumberFromArrayUsingBrouteForce(int[] nums1) {
        for (int i = 0; i <= nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] == i) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

}

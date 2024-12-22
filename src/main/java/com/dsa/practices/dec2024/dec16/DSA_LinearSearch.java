package com.dsa.practices.dec2024.dec16;

public class DSA_LinearSearch {

    /*
       Linear Search is the simplest search algorithm used to find an element in a list or array.
       It works by sequentially checking each element of the list until the target element is found
       or the end of the list is reached.

       Key Characteristics of Linear Search:
       1. Iterative Approach: The algorithm starts from the first element and moves to the next,
                              checking each one until the target is found.
       2. Unsorted Data: It doesn't require the data to be sorted.

       Time Complexity:
            Best Case: O(1) (When the element is at the beginning of the list).
            Worst Case: O(n) (When the element is at the end or not present).

      How Linear Search Works:
      1. Start from the first element of the array/list.
      2. Compare the current element with the target element.
      3. If the current element matches the target, return its position (or true).
      4. If the current element doesn't match, move to the next element.
      5. Repeat steps 2–4 until the element is found or the list ends.

    */

    public static void main(String[] args) {
        int[] data = {1, 4, 2, 4, 63, 3, 6};
        int target = 631;

        int resultIndex = linearSearch(data, target);
        if (resultIndex != -1) {
            System.out.println("Target element index :: " + resultIndex);
        } else {
            System.out.println("Target element not found in the given list");
        }
    }

    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

package com.dsa.practices.dec2024.dec16;

public class BinarySearch {

    /*
       Binary Search is an efficient searching algorithm used to find the position of a target
       element in a sorted array or list.
       It works by repeatedly dividing the search interval in half, eliminating half of the
       possible locations in each step.

       Key Characteristics of Binary Search:
       1. Works Only on Sorted Data: Binary search requires the array or list to be sorted before
                                     it can be applied.
       2. Divide and Conquer Approach: The algorithm divides the array into smaller subarrays
                                       in each iteration.

       Time Complexity:
            Best Case: O(1) (When the element is at the beginning of the list).
            Worst Case: O(logn) (Array size is halved in each step).

       How Binary Search Works:
       1. Define the low (start) and high (end) pointers.
       2. Calculate the middle index: mid = low + (high−low)/2
       3. Compare the middle element with the target:
            a. If target == arr[mid], return the index.
            b. If target < arr[mid], narrow the search to the left half (update high = mid − 1)
            c. If target > arr[mid], narrow the search to the right half (update low = mid + 1)
       4. Repeat until the target is found or low > high

    */

    public static void main(String[] args) {
        int[] data = {1, 4, 5, 8, 9, 13, 61};
        int target = 13;

        int resultIndex = binarySearch(data, target);
        if (resultIndex != -1) {
            System.out.println("Target element index :: " + resultIndex);
        } else {
            System.out.println("Target element not found in the given list");
        }
    }

    public static int binarySearch(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data[mid] == target) {
                return mid;
            } else if (data[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

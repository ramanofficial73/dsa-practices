package com.dsa.practices.dec2024.dec18;

import java.util.Arrays;

public class DSA_MergeSort {
    /*

       Merge Sort is a divide-and-conquer sorting algorithm that works by recursively dividing an
       array into smaller sub-arrays, sorting those sub-arrays, and then merging them back together
       to produce a sorted result.

       Key Characteristics of Binary Search:
       1. Divide and Conquer Approach: Merge Sort divides the array into halves, recursively sorts each
            half, and then merges the sorted halves to produce the final sorted array.

       2. Works Well for Large Data: The algorithm is efficient for large datasets, especially when memory space is not a constraint.

       3. Stable Sorting Algorithm: Merge Sort maintains the relative order of equal elements, making it a stable sorting algorithm.


       Time Complexity:
            Best Case: O(nlogn) (Even if the input array is already sorted, it still divides and merges.).
            Average Case: O(nlogn) (Regardless of the input distribution, the algorithm always divides and merges the data)
            Worst Case: O(logn) (Sorting an array in reverse order takes the same time as sorting any random array).

        How Merge Sort Works:
        1. Divide: Split the array into two halves. This process continues recursively until each
                   subarray contains only one element (which is inherently sorted).

        2. Conquer: Sort and merge the subarrays. This step involves comparing the elements of two
                    sorted subarrays and arranging them in order.

        3. Combine: Combine the sorted subarrays into a single sorted array.

    */

    public static void main(String[] args) {
        int[] data = {1, 4, 2, 5, 11, 4};
        int startIdx = 0;
        int endIds = data.length - 1;
        System.out.println("Unsorted array : " + Arrays.toString(data));
        mergeSort(data, startIdx, endIds);
        System.out.println("Sorted array : " + Arrays.toString(data));
    }

    private static void mergeSort(int[] data, int startIdx, int endIds) {
        if (startIdx < endIds) {
            int mid = (startIdx + endIds) / 2;
            mergeSort(data, startIdx, mid);
            mergeSort(data, mid + 1, endIds);
            merge(data, startIdx, mid, endIds);
        }
    }

    private static void merge(int[] data, int startIdx, int mid, int endIds) {
        int sizeOfSortedArray = endIds - startIdx + 1;
        int[] sortedArray = new int[sizeOfSortedArray];

        int idx1 = startIdx;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endIds) {
            if (data[idx1] <= data[idx2]) {
                sortedArray[x] = data[idx1];
                x++;
                idx1++;
            } else {
                sortedArray[x] = data[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            sortedArray[x] = data[idx1];
            x++;
            idx1++;
        }

        while (idx2 <= endIds) {
            sortedArray[x] = data[idx2];
            x++;
            idx2++;
        }

        for (int i = 0, j = startIdx; i < sortedArray.length; i++, j++) {
            data[j] = sortedArray[i];
        }
    }

}

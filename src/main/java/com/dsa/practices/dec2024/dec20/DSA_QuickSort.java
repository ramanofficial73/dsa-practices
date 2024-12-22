package com.dsa.practices.dec2024.dec20;

public class DSA_QuickSort {
    /*
        Quick Sort is a divide-and-conquer sorting algorithm that selects a "pivot" element,
        partitions the array into smaller sub-arrays (elements less than the pivot on the left,
        greater on the right), and recursively sorts the sub-arrays.

        Key Characteristics:
        1. In-Place: Sorts the array without needing extra space.
        2. Efficient on Average: Performs well with average time complexity of O(nlogn).
        3. Unstable: The order of equal elements can change.
        4. Divide and Conquer: Divides the array and recursively sorts parts.
        5. Recursive: Calls itself on sub-arrays.

        How Quick Sort Works:
        1. Pick a Pivot: Choose an element from the array, known as the pivot.
        Common strategies are picking the first, last, or middle element.

        2. Partitioning: Rearrange the array so that elements smaller than the pivot are on the left,
        and elements larger than the pivot are on the right.

        3. Recursive Sort: Apply Quick Sort recursively to the sub-arrays to the left and right of the pivot.

        Time Complexity:
        Best Case: O(nlogn) (Occurs when the pivot divides the array into nearly equal sub-arrays.)
        Worst Case: O(n^2) (Occurs when the pivot splits the array evenly on average.).
        Average Case: O(nlogn)  (Occurs when the pivot is the smallest or largest element each time, leading to unbalanced partitions.)

     */

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 5, 3, 6};
        System.out.print("Before sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        quickSort(nums);

        System.out.println();
        System.out.print("After sorting : " + " ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void quickSort(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}

package com.dsa.practices.dec2024.dec20;

public class BubbleSort {
    /*
        Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
        compares adjacent elements, and swaps them if they are in the wrong order.
        This process is repeated until the list is sorted.

        When to Use Bubble Sort?
        Bubble Sort is not efficient for large datasets due to its O(n2) time complexity.
        However, it is useful for:
        1. Small datasets.
        2. Teaching purposes to understand basic sorting principles.
        3. When the input is already nearly sorted (best-case scenario).

        How Bubble Sort Works
        1. Start from the beginning of the list.
        2. Compare each pair of adjacent elements.
        3. Swap them if the first element is greater than the second.
        4. Continue this process for the entire list. After each pass,
            the largest unsorted element "bubbles up" to its correct position.
        5. Repeat the process for the remaining unsorted part of the list until no swaps are needed.

        Time Complexity:
            Best Case: O(n) (when the list is already sorted and no swaps are needed).
            Worst Case: O(n2) (when the list is sorted in reverse order).
            Average Case: O(n2)

     */

    public static void main(String[] args) {
        int nums[] = {1, 5, 2, 5, 3, 6};
        System.out.print("Before sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        bubbleSort(nums);

        System.out.println();
        System.out.print("After sorting : " + " ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}

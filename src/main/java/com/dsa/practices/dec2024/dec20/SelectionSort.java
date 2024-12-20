package com.dsa.practices.dec2024.dec20;

public class SelectionSort {
    /*
        Selection Sort works by repeatedly finding the smallest (or largest) element from
        the unsorted portion of the array and swapping it with the first unsorted element.
        It performs this selection process for each position in the array until the entire array is sorted.

        How It Works:
        1. Start at the beginning of the array.
        2. Find the smallest element in the unsorted portion of the array.
        3. Swap it with the first unsorted element.
        4. Move the boundary of the sorted and unsorted portions one step forward.
        5. Repeat the process until the entire array is sorted.

        Key Characteristics:
        1. Simple and Intuitive: Easy to understand, works by finding the smallest or largest element and swapping it.
        2. In-Place Sorting: Doesn't require extra memory beyond the input array, uses only a constant amount of space.
        3. Unstable: It is not stable, meaning equal elements might change relative order.
        4. Inefficient for Large Datasets: Due to its quadratic time complexity, it’s inefficient for large arrays.

        Time Complexity:
            Best Case: O(n^2) (it always performs the same number of comparisons, even for sorted input).
            Worst Case: O(n^2)
            Average Case: O(^2)

     */

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 5, 3, 6};
        System.out.print("Before sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        selectionSort(nums);

        System.out.println();
        System.out.print("After sorting : " + " ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int smallestNumber = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[smallestNumber] > nums[j]) {
                    smallestNumber = j;
                }
            }
            int temp = nums[smallestNumber];
            nums[smallestNumber] = nums[i];
            nums[i] = temp;
        }
    }
}

package com.dsa.practices.dec2024.dec22;

public class DSA_InsertionSort {
    /*
        Insertion Sort is an algorithm that builds a sorted array one element at a time by repeatedly
        picking the next element from the unsorted part and placing it into the correct position in
        the sorted part.
        It’s like sorting a hand of playing cards: you start with an empty hand (sorted part) and
        add each new card by placing it in the correct position.

        Key Characteristics:
        1. Simple: Easy to implement and understand.
        2. In-Place: Sorts the array without extra space.
        3. Efficient for Small Datasets: Works well on small or partially sorted arrays.
        4. Stable: Maintains the order of equal elements.

        How Insertion Sort Works
        1. Start with the second element: The first element is already considered sorted because
        it's the only element in that part of the array.

        2. Pick the next element (key): You then look at the second element (key) and compare it with
        the previous element(s) in the sorted part.

        3. Shift elements if needed: If the key is smaller than the element before it,
        you shift that element to the right.

        4. Insert the key in the right place: Once the appropriate position is found (or no shift is needed),
        place the key element there.

        5. Repeat for each element: Move through all elements in the array, repeatedly placing
        each element in its correct sorted position.

        Time Complexity:
            Best Case: O(n)
            Worst Case: O(n^2) (when the list is sorted in reverse order).
            Average Case: O(^2)
     */

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 5, 3, 6};
        System.out.print("Before sorting : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        insertionSort(nums);

        System.out.println();
        System.out.print("After sorting : " + " ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int[] nums) {
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

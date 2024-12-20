package com.dsa.practices.dec2024.dec18;

import java.util.Arrays;

public class LeetCode_88_MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        int m = 2;
        int n = 3;

        mergeSortArray(num1, m, num2, n);
    }

    private static void mergeSortArray(int[] num1, int m, int[] num2, int n) {
        int[] mergedArray = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, mergedArray, 0, num1.length);
        System.arraycopy(num2, 0, mergedArray, num1.length, num2.length);
        System.out.println("Merged array : " + Arrays.toString(mergedArray));

        int startingIdx = 0;
        int endingIdx = mergedArray.length - 1;

        meredSortAlgo(mergedArray, startingIdx, endingIdx);


        System.out.println("Merged array : " + Arrays.toString(mergedArray));
    }

    private static void meredSortAlgo(int[] mergedArray, int startingIdx, int endingIdx) {
        if (startingIdx < endingIdx) {
            int mid = (startingIdx + endingIdx) / 2;

            meredSortAlgo(mergedArray, startingIdx, mid);
            meredSortAlgo(mergedArray, mid + 1, endingIdx);

            merge(mergedArray, startingIdx, mid, endingIdx);

        }
    }

    private static void merge(int[] data, int startingIdx, int mid, int endIds) {
        int sizeOfArrayList = endIds - startingIdx + 1;
        int[] sortedArray = new int[sizeOfArrayList];

        int idx1 = startingIdx;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= endIds) {
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

            for (int i = 0, j = startingIdx; i < sortedArray.length; i++, j++) {
                data[j] = sortedArray[i];
            }

        }
    }
}

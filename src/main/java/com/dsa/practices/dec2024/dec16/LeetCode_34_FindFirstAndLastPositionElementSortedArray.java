package com.dsa.practices.dec2024.dec16;

import java.util.Arrays;

public class LeetCode_34_FindFirstAndLastPositionElementSortedArray {
    public static void main(String[] args) {
        int[] data = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("Result list : " + Arrays.toString(getFirstAndLastIndexInArray(data, target)));

    }

    private static int[] getFirstAndLastIndexInArray(int[] data, int target) {
        int[] result = new int[2];
        result[0] = getFirstIndex(data, target);
        result[1] = getLastIndex(data, target);
        return result;
    }

    private static int getFirstIndex(int[] data, int target) {
        int idx = -1;
        int start = 0;
        int end = data.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(data[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(data[mid] == target) idx = mid;
        }
        return idx;
    }

    private static int getLastIndex(int[] data, int target) {
        int index = -1;
        int first = 0;
        int last = data.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (data[mid] == target) {
                index = mid;
            } else if (data[mid] <= target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return index;
    }
}

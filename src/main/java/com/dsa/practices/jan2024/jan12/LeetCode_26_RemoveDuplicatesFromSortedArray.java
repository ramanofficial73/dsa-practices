package com.dsa.practices.jan2024.jan12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] data = {1,1,2};
        System.out.println(removeDuplicateElement(data));
    }

    private static int removeDuplicateElement(int[] data){
        if (data.length <= 1) {
            return data.length;
        }
        int idx = 1;
        for (int i=1; i< data.length; i++) {
            if (data[i-1] != data[i]) {
                data[idx]  = data[i];
                idx++;
            }
        }
        return idx;
    }
}

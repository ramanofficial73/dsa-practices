package com.dsa.practices.feb2025.feb03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_RemoveDuplicateElementFromList {
    public static void main(String[] args) {
        int[] data = {1, 2, 2, 5, 5, 6};
        System.out.println(elementOfLengthList(data));
    }

    public static int elementOfLengthList(int[] data) {
        /*
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
        */

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (!res.contains(data[i])) {
                res.add(data[i]);
            }
        }
        return res.size();
    }
}

package com.dsa.practices.jan2024.jan01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupElementArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 5, 6, 3, 4, 5, 6};
        System.out.println(groupElement(nums));
    }

    public static List<List<Integer>> groupElement(int[] nums) {
        HashMap<Integer, List<Integer>> data = new HashMap<>();

        for (int n : nums) {
            data.computeIfAbsent(n, x -> new ArrayList<>()).add(n);
        }
        List<List<Integer>> res = new ArrayList<>(data.values());
        return res;
    }
}

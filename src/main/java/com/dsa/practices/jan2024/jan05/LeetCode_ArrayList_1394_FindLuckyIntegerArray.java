package com.dsa.practices.jan2024.jan05;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode_ArrayList_1394_FindLuckyIntegerArray {
    public static void main(String[] args) {
        int[] data = {2,2,2,3,3};
        System.out.println(findLucky(data));
    }

    public static int findLucky(int[] arr) {
        List<Integer> data = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Integer, Long> collect = data.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        int res = -1;
        for (Map.Entry<Integer, Long> entry : collect.entrySet()) {
            if (Long.valueOf(entry.getKey()) == entry.getValue()) {
                res = Math.max(res, entry.getKey());
            }
        }
        return res;
    }
}

package com.dsa.practices.dec2024.dec21;

import java.util.HashMap;
import java.util.Map;

public class FindMaxAndMinElementInArray {
    public static void main(String[] args) {
        int num[] = {2, 4, 1, 11, 5, 7};
        System.out.println("Max and min values : " + getMinMaxElement(num));
    }

    public static Map<String, Integer> getMinMaxElement(int[] nums) {
        Map<String, Integer> map = new HashMap<>();
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        map.put("Max Value", max);
        map.put("Min Value", min);
        return map;
    }
}

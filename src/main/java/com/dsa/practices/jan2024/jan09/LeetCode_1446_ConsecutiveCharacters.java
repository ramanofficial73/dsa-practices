package com.dsa.practices.jan2024.jan09;

public class LeetCode_1446_ConsecutiveCharacters {
    public static void main(String[] args) {
        System.out.println(maxPower("cc"));
    }
    public static int maxPower(String s) {
        int count = 1;
        int max = 1;

        for (int i=1; i< s.length(); i++) {
            char previous = s.charAt(i-1);
            char current = s.charAt(i);
            if (previous == current) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 1;
            }
        }
        max = Math.max(count, max);
        return max;
    }

}

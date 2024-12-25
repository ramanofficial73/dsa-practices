package com.dsa.practices.dec2024.dec25;

public class LeetCode_String_12_IntergerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(11));
    }

    public static String intToRoman(int num) {
        String[] romanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while(num >= values[i]) {
                num -= values[i];
                s.append(romanValues[i]);
            }
        }
        return s.toString();
    }
}

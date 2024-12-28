package com.dsa.practices.dec2024.dec28;

public class LeetCode_Strig_415_AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
    }

    public static String addStrings(String num1, String num2) {
        Long n1 = Long.parseLong(num1);
        Long n2 = Long.parseLong(num2);
        return String.valueOf(n1 + n2);
    }
}

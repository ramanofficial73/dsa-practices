package com.dsa.practices.dec2024.dec26;

public class LeetCode_String_43_MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("6913259244", "71103343"));
    }

    //need to submit leecode theer
    public static String multiply(String num1, String num2) {
        try {
            long n1 = Long.parseLong(num1);
            long n2 = Long.parseLong(num2);
            return String.valueOf(n1 * n2);
        } catch (Exception e) {
            return "";
        }
    }
}

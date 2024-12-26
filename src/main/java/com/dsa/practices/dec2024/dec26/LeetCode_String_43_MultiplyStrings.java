package com.dsa.practices.dec2024.dec26;

public class LeetCode_String_43_MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("123456789", "987654321"));
    }

    //need to submit leecode theer
    public static String multiply(String num1, String num2) {
        try {
            long n1 = Integer.parseInt(num1);
            long n2 = Integer.parseInt(num2);
            return String.valueOf(n1 * n2);
        } catch (Exception e) {
            return "";
        }
    }
}

package com.dsa.practices.feb2025.feb02;

public class LeetCode_67_AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder ab = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum = sum + a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum = sum + b.charAt(j--) - '0';
            }
            ab.append(sum % 2);
            carry = sum / 2;
        }
        return ab.reverse().toString();
    }
}

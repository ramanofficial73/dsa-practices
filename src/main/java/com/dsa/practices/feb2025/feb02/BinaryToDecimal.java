package com.dsa.practices.feb2025.feb02;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "101";
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i); // Get character ('0' or '1')
            int num = ch - '0';
            decimal = decimal * 2 + num;
        }
        System.out.println(decimal);
    }
}

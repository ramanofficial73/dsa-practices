package com.dsa.practices.jan2025.jan12;

public class LeetCode_709_ToLowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase("raMAN"));
    }

    public static String toLowerCase(String s) {
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            /* Checking with asci Values for Capital letter 65 to 90*/
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char) (c[i] + 32);   //For adding asci value to lower case
            }
        }
        return String.valueOf(c);
    }
}

package com.dsa.practices.dec2024.dec24;

import java.util.Arrays;

public class LeetCode_String_242_ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "cba"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1, t1);
    }
}

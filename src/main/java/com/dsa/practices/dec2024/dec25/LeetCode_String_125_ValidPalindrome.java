package com.dsa.practices.dec2024.dec25;

public class LeetCode_String_125_ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String finalString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reverseString = "";
        int linghts = finalString.toCharArray().length -1;
        for (int i = linghts; i >= 0; i--) {
            char c = finalString.charAt(i);
            reverseString += c;
        }
        if (reverseString.equals(finalString)) {
            return true;
        } else {
            return false;
        }
    }
}

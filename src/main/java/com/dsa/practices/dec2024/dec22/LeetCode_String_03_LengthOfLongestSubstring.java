package com.dsa.practices.dec2024.dec22;

import java.util.HashSet;

public class LeetCode_String_03_LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        HashSet<Character> charMap = new HashSet<>();

        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.toCharArray().length; i++) {
            char currentChar = s.charAt(i);
            while (charMap.contains(currentChar)) {
                charMap.remove(s.charAt(start));
                start++;
            }
            charMap.add(currentChar);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        System.out.println("lengthOfLongestSubstring : " + maxLength);
    }
}

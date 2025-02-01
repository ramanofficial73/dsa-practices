package com.dsa.practices.feb2025.feb01;

import java.util.HashMap;

public class LeetCode_Contest_149_FindValidPairAdjacentDigitsString {
    public String findValidPair(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            char firstDigit = s.charAt(i);
            char secondDigit = s.charAt(i + 1);
            if (firstDigit != secondDigit) {
                if (freq.get(firstDigit) == Character.getNumericValue(firstDigit) &&
                        freq.get(secondDigit) == Character.getNumericValue(secondDigit)) {
                    return "" + firstDigit + secondDigit;
                }
            }
        }
        return "";
    }
}

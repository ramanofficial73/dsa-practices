package com.dsa.practices.feb2025.feb01;

public class LeetCode_557_ReverseWordsInStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : split) {
            StringBuilder reverseWord = new StringBuilder(word);
            stringBuilder.append(reverseWord.reverse().toString()).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}

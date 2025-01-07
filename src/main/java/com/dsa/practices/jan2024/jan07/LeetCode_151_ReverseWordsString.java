package com.dsa.practices.jan2024.jan07;

public class LeetCode_151_ReverseWordsString {
    public static void main(String[] args) {
        String data = "  hello world  ";
        System.out.println(reverseWords(data));
    }

    public static String reverseWords(String s) {
//        String[] data = s.trim().split(" ");
        String[] data = s.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = data.length - 1; i >= 0; i--) {
            builder.append(data[i] + " ");
        }
        return builder.toString().trim();
    }
}

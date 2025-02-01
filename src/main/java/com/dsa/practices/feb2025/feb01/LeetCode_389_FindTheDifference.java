package com.dsa.practices.feb2025.feb01;

public class LeetCode_389_FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcdt"));
    }

    public static char findTheDifference(String s, String t) {
        int sumS= 0;
        int sumT = 0;

        for (char c: s.toCharArray()) {
            sumS += c;
        }

        for (char c: t.toCharArray()) {
            sumT += c;
        }
        return (char) (sumT - sumS);
    }
}

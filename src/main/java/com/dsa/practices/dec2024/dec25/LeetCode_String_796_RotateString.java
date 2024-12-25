package com.dsa.practices.dec2024.dec25;

public class LeetCode_String_796_RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdea"));
    }
    public static boolean rotateString(String s, String goal) {
        String combineString = s + s;
        int length1 = s.length();
        int length2 = goal.length();
        if (length1 != length2) {
            return false;
        }
        if (combineString.indexOf(goal) == -1 || combineString.indexOf(goal) == 0) {
            return false;
        }
        return true;
    }
}

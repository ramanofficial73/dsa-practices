package com.dsa.practices.dec2024.dec25;

public class LeetCode_String_38_CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        String res = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            counter++;
            if (s.length() - 1 == i || s.charAt(i) != s.charAt(i + 1)) {
                res = res + counter + s.charAt(i);
                counter = 0;
            }
        }
        return res;
    }
}

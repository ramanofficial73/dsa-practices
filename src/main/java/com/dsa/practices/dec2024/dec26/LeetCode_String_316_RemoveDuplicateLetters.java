package com.dsa.practices.dec2024.dec26;

import java.util.*;

public class LeetCode_String_316_RemoveDuplicateLetters {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("bcabc"));
    }

    public static String removeDuplicateLetters(String s) {
        List<Character> set = new ArrayList<>();
        String s1 = "";
        for (char data: s.toCharArray()){
            if (!set.contains(data)) {
                set.add(data);
            }
        }
        for (char data: set) {
         s1 = s1 + data;
        }
        Arrays.sort(s1.toCharArray());
        return s1;
    }
}

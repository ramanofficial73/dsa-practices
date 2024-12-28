package com.dsa.practices.dec2024.dec28;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode_String_387_FirstUniqueCharacter_String {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static int firstUniqChar(String s) {
        int index = -1;
        Map<String, Long> collect = Arrays.asList(s.split(""))
                .stream().collect(
                        Collectors.groupingBy(x -> x, Collectors.counting()));
        for (int i = 0; i < s.length(); i++) {
            if (collect.get(String.valueOf(s.charAt(i))) == 1) {
                return i;
            }
        }
        return index;
    }
}

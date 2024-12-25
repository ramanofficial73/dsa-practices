package com.dsa.practices.dec2024.dec25;

import java.util.*;

public class LeetCode_String_49_GroupAnagrams {
    public static void main(String[] args) {
        String[] data = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(data));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        List<List<String>> finalList = new ArrayList<>();
        for (String data: strs) {
            char[] chars = data.toCharArray();
            Arrays.sort(chars);
            String s1 = new String(chars);
            anagramGroups.computeIfAbsent(s1, k -> new ArrayList<>())
                    .add(data);
        }
        finalList.addAll(anagramGroups.values());
        return finalList;
    }
}

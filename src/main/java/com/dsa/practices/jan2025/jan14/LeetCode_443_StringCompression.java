package com.dsa.practices.jan2025.jan14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCode_443_StringCompression {
    public static void main(String[] args) {
        char[] data = {'a'};
        System.out.println(compress(data));
    }

    public static int compress(char[] chars) {
        List<Character> data = new ArrayList<>(
                new String(chars)
                        .chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.toList())
        );
        Map<Character, Long> collect = data.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        StringBuilder builder = new StringBuilder();
        for (Character key : collect.keySet()) {
            Long count = collect.get(key);
            if (count == 1) {
                builder.append(key);
            } else {
                builder.append(key + String.valueOf(count));
            }
        }
        int length = builder.toString().length();
        return length;
    }
}

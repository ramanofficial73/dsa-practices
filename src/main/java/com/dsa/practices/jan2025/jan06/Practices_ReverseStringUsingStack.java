package com.dsa.practices.jan2025.jan06;

import java.util.Stack;

public class Practices_ReverseStringUsingStack {
    public static void main(String[] args) {
        System.out.println(reverseStr("raman"));
    }

    public static String reverseStr(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.push(c);
        }
        StringBuilder builder = new StringBuilder();
        while (stack.size() > 0) {
            builder.append(stack.pop());
        }
        return builder.toString();
    }
}

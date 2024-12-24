package com.dsa.practices.dec2024.dec24;

import java.util.Stack;

public class LeetCode_String_20_ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

    public static boolean isValid(String s) {
        String[] strings = s.split("");
        Stack<String> stack = new Stack<>();

        for (String data : strings) {
            if (data.equals("{") || data.equals("[") || data.equals("(")) {
                stack.push(data);
            } else {
                if (data.equals("]") || data.equals("}") || data.equals(")")) {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    String lastElement = stack.pop();
                    if (data.equals("}") && !lastElement.equals("{") ||
                            data.equals("]") && !lastElement.equals("[") ||
                            data.equals(")") && !lastElement.equals("(")) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}

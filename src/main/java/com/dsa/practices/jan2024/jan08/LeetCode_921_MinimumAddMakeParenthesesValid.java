package com.dsa.practices.jan2024.jan08;

import java.util.Stack;

public class LeetCode_921_MinimumAddMakeParenthesesValid {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char chars : s.toCharArray()) {
            if (chars == '(') {
                stack.push(chars);
            } else if (stack.size() > 0 && stack.peek() == '(') {
                stack.pop();
            } else {
                count++;
            }
        }
        return count + stack.size();
    }
}

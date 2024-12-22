package com.dsa.practices.dec2024.dec20;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Practices_ValidString {
    public static void main(String[] args) {
        String data = "{[()]}";
        System.out.println("Valid string is :: " + checkValidString(data));
    }

    private static boolean checkValidString(String data) {
        Stack<String> stack = new Stack<>();
        List<String> listOfData = Arrays.asList(data.split(""));
        for (String item : listOfData) {
            if (item.equals("{") || item.equals("[") || item.equals("(")) {
                stack.push(item);
            } else if (item.equals("}") || item.equals("]") || item.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                }
                String lastElement = stack.pop();
                if ((item.equals("}") && !lastElement.equals("{")) ||
                        (item.equals("]") && !lastElement.equals("[")) ||
                        (item.equals(")") && !lastElement.equals("("))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

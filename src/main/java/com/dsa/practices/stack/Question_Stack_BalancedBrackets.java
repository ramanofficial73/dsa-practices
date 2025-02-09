package com.dsa.practices.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Question_Stack_BalancedBrackets {
    public static void main(String[] args) {
        String data = "}{{[]}}";
        System.out.println(isValid(data));
    }

    private static boolean isValid(String data) {
        List<String> listsOfEle = Arrays.asList(data.split(""));
        Stack<String> stack = new Stack<>();
        for (int i = 0; i <= listsOfEle.size() - 1; i++) {
            if (listsOfEle.get(i).equals("{")
                    || listsOfEle.get(i).equals("(")
                    || listsOfEle.get(i).equals("[")) {
                stack.push(listsOfEle.get(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
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

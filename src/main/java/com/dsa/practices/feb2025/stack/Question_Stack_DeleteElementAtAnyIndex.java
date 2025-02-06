package com.dsa.practices.feb2025.stack;

import java.util.Stack;

public class Question_Stack_DeleteElementAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int idx = 2;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack Element : " + stack);

        Stack<Integer> temp = new Stack<>();
        while (stack.size() > idx) {
            temp.push(stack.pop());
        }

        stack.pop();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        System.out.println("After Delete Stack Element : " + stack);
    }
}

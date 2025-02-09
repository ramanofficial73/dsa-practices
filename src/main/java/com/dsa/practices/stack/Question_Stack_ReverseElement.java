package com.dsa.practices.stack;

import java.util.Stack;

public class Question_Stack_ReverseElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack Element : " + stack);

        Stack<Integer> copyStack = new Stack<>();
        while (!stack.isEmpty()) {
            copyStack.push(stack.pop());
        }
        System.out.println("Reverse Element : " + copyStack);
    }
}

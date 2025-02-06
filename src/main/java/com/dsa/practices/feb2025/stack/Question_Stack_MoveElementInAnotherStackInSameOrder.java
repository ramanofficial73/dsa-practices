package com.dsa.practices.feb2025.stack;

import java.util.Stack;

public class Question_Stack_MoveElementInAnotherStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack Element : " + stack);

        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        Stack<Integer> copyStack = new Stack<>();
        while (!temp.isEmpty()) {
            copyStack.push(temp.pop());
        }
        System.out.println("After Moved Stack Element : " + copyStack);
    }
}

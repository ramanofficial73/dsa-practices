package com.dsa.practices.jan2025.jan06;

import java.util.Stack;

public class Practices_PushBottomInStackOrAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        System.out.println("Main Stack" + stack);

        Stack<Integer> tempStack = new Stack<>();
        while (stack.size() > 1) {   //Need to add in 1 index of stack
            tempStack.push(stack.pop());
        }

        stack.push(2);
        while (tempStack.size() > 0) {
            stack.push(tempStack.pop());
        }
        System.out.println("After adding 2 in first index : " + stack);
    }

}

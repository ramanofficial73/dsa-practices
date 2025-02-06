package com.dsa.practices.feb2025.stack;

import java.util.Stack;

public class Question_Stack_DisplayElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Inserted Stack Element : " + stack);

        displayReverseUsingRecursion(stack);
        System.out.println();
        displayUsingRecursion(stack);
    }

    private static void displayReverseUsingRecursion(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        Integer pop = st.pop();
        System.out.print(pop + " ");
        displayReverseUsingRecursion(st);
        st.push(pop);
    }

    private static void displayUsingRecursion(Stack<Integer> st) {
        if (st.size() == 0) {
            return;
        }
        Integer pop = st.pop();
        displayUsingRecursion(st);
        System.out.print(pop + " ");
        st.push(pop);
    }
}

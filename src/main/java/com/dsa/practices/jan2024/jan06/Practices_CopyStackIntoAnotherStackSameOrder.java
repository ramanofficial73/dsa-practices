package com.dsa.practices.jan2024.jan06;

import java.util.Stack;

public class Practices_CopyStackIntoAnotherStackSameOrder {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Raman");
        stack.push("kumar");
        stack.push("sharma");

        System.out.println(stack);

        Stack<String> tempStack = new Stack<>();
        while (stack.size() > 0) {
            tempStack.push(stack.pop());
        }

        Stack<String> fStack = new Stack<>();
        while (tempStack.size() > 0) {
            fStack.push(tempStack.pop());
        }

        System.out.println("Another Stack : " + fStack);


    }

}

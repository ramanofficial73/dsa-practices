package com.dsa.practices.jan2024.jan06;

import java.util.Stack;

public class DSA_Stack {
    /*
    What is a Stack?
    A stack is a linear data structure that follows the LIFO (Last In, First Out) principle.
    It allows adding and removing elements only from one end, called the top of the stack.

    Key Operations
    2. Push: Add an element to the top of the stack.
    1. Pop: Remove and return the top element of the stack.
    3. Peek: Retrieve the top element without removing it.
    4. isEmpty: Check if the stack is empty.

    Key Characteristics of a Stack
    1. Linear Data Structure: A stack is a sequential data structure where elements are arranged linearly.
        Operations are performed in a specific order based on the LIFO (Last In, First Out) principle.
    2. LIFO Principle: The last element added to the stack is the first one to be removed.
        This ensures that newer items are dealt with before older ones.
    3. Single Access Point: All operations (push, pop, peek) are performed at one end of the stack,
        called the top. The other end is inaccessible.
    4. Basic Operations:
        push(), pop(), peek(), isEmpty()
    5. Overflow and Underflow:
        #1. Overflow occurs when you try to push an element into a full stack (fixed size).
        #2. Underflow occurs when you try to pop an element from an empty stack.
    6. Time Complexity: All basic operations (push, pop, peek) are performed in O(1) time.
    7. Sequential Access: Elements can only be accessed sequentially through push and pop operations,
        making random access impossible.
    8. Memory Usage: A stack may require additional memory to store the pointer to the top element
        or dynamic resizing logic.

    */

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("raman");
        stack.push("sharam");
        System.out.println("After pushing element : " + stack);

        String pop = stack.pop();
        System.out.println("Remove element : " + pop);
        System.out.println("Stack : " + stack);

        System.out.println("Get last element : " + stack.peek());

        System.out.println(stack.isEmpty());
    }

}

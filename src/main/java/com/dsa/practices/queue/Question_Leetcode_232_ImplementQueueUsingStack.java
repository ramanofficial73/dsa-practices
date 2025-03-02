package com.dsa.practices.queue;

import java.util.Stack;

public class Question_Leetcode_232_ImplementQueueUsingStack {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> temp = new Stack<>();
    public static void main(String[] args) {

    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        while (stack.size() > 1) {
            temp.push(stack.pop());
        }
        Integer pop = stack.pop();
        while (temp.size() > 0) {
            stack.push(temp.pop());
        }
        return pop;
    }

    public int peek() {
        while (stack.size() > 1) {
            temp.push(stack.pop());
        }
        Integer peek = stack.peek();
        while (temp.size() > 0) {
            stack.push(temp.pop());
        }
        return peek;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}

package com.dsa.practices.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Question_Stack_StackUsingQueue {
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
    }

    public static void push(int val) {
        queue.add(val);
    }

    public static int peek() {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
        Integer peek = queue.peek();
        queue.add(queue.remove());
        return peek;
    }

    public static int pop() {
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }
        Integer peek = queue.peek();
        queue.remove();
        return peek;
    }

    public static boolean empty() {
        if (queue.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

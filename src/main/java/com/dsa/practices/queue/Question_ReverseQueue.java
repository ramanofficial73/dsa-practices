package com.dsa.practices.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question_ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);

        Stack<Integer> temp = new Stack<>();

        while (queue.size() > 0) {
            temp.push(queue.poll());
        }

        while (temp.size() > 0) {
            queue.add(temp.pop());
        }

        System.out.println(queue);


    }
}

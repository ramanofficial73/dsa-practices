package com.dsa.practices.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAllElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (queue.size() > 0) {
            Integer peek = queue.poll();
            System.out.print(peek + " ");
            temp.add(peek);
        }

        while (temp.size() > 0) {
            queue.add(temp.poll());
        }
        System.out.println(queue);

    }
}

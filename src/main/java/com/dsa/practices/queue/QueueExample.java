package com.dsa.practices.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        /*  Queue is an interface (java.util.Queue), so we cannot instantiate it directly.
            Instead, we use a concrete class like LinkedList, which implements Queue.
        */
        Queue<Integer> queue = new LinkedList<>();

        /* Adding Element */
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        /* Removing element */
        queue.remove();
        queue.poll();
        System.out.println(queue);

        /* Getting element from the front */
        Integer peek = queue.peek();
        System.out.println(peek);

    }
}

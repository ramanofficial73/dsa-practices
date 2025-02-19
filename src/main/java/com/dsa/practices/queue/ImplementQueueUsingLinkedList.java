package com.dsa.practices.queue;

import java.util.LinkedList;

public class ImplementQueueUsingLinkedList {
    private LinkedList<Integer> list;

    ImplementQueueUsingLinkedList() {
        list = new LinkedList<>();
    }


    public static void main(String[] args) {
        ImplementQueueUsingLinkedList queue = new ImplementQueueUsingLinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.display();

        /* Removing element */
        int delete = queue.delete();
        System.out.println("Delete Element : " + delete);

        /* Getting element from the front */
        Integer peek = queue.peek();
        System.out.println("peek element : " + peek);

        /* Getting Size */
        System.out.println("Size :" + queue.size());

        queue.display();
        System.out.println();

        queue.add(5);


        queue.display();
        System.out.println();

        /* Check Empty */
        System.out.println("is Empty queue :" + queue.isEmpty());

    }

    public void add(int element) {
        list.addLast(element);
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        } else {
            return list.getFirst();
        }
    }

    public void display() {
        System.out.println("Queue : " + list);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int delete() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

}

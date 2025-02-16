package com.dsa.practices.queue;

import java.util.ArrayList;

public class QueueImplUsingArrayList {
    private ArrayList<Integer> arrayList;

    QueueImplUsingArrayList() {
        arrayList = new ArrayList<>();
    }


    public static void main(String[] args) {
        QueueImplUsingArrayList queue = new QueueImplUsingArrayList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.display();

        /* Removing element */
        int delete = queue.delete();
        System.out.println("Delete Element : " +delete);

        /* Getting element from the front */
        Integer peek = queue.peek();
        System.out.println("peek element : " + peek);

        /* Getting Size */
        System.out.println("Size :" + queue.size());

        /* Check Empty */
        System.out.println( "is Empty queue :" + queue.isEmpty());

    }

    public void add(int element) {
        arrayList.add(element);
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        } else {
            return arrayList.get(0);
        }
    }
    public void display() {
        System.out.println("Queue : " + arrayList);
    }

    public int size() {
        return arrayList.size();
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    public int delete() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arrayList.remove(0);
    }

}

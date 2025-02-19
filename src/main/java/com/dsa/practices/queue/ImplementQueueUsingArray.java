package com.dsa.practices.queue;

public class ImplementQueueUsingArray {
    int front = -1;
    int rear = -1;
    public int size = 0;

    int[] arr = new int[5];


    public static void main(String[] args) {
        ImplementQueueUsingArray queue = new ImplementQueueUsingArray();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.display();
        System.out.println();

        /* Removing element */
        int delete = queue.remove();
        System.out.println("Delete Element : " + delete);

        /* Getting element from the front */
        Integer peek = queue.peek();
        System.out.println("peek element : " + peek);

        /* Getting Size */
//        System.out.println("Size :" + );

        queue.display();
        System.out.println();

        /* Check Empty */
        System.out.println("is Empty queue :" + queue.isEmpty());

    }

    public void add(int val) {
        if (rear == arr.length-1) {
            System.out.println("Queue full!");
            return;
        }
        if (front == -1) {
            front = rear = 0;
            arr[0] = val;
        } else {
            arr[rear + 1] = val;
            rear++;
        }
        size++;
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        } else {
            return arr[front];
        }
    }

    public void display() {
        for (int i=front; i<= rear;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int x = arr[front];
        front++;
        size--;
        return x;
    }

}

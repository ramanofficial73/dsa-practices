package com.dsa.practices.queue;

public class ImplementCircularQueueUsingArray {
    int front = -1;
    int rear = -1;
    int size = 0;
    int[] arr = new int[5];


    public static void main(String[] args) {
        ImplementCircularQueueUsingArray queue = new ImplementCircularQueueUsingArray();
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

        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.display();
        System.out.println();

        /* Check Empty */
        System.out.println("is Empty queue :" + queue.isEmpty());

    }

    public void add(int val) {
        if (size == arr.length) {
            System.out.println("Queue full!");
            return;
        } else if (size == 0) {
            front = rear = 0;
            arr[0] = val;
        } else if (rear < arr.length - 1) {
            arr[++rear] = val;
        } else if (rear == arr.length - 1) {
            rear = 0;
            arr[0] = val;
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
        if (isEmpty()) {
            System.out.println("is empty");
        } else if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = front; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        } else {
            int val = arr[front];
            if (front == arr.length - 1) {
                front = 0;
            } else {
                front++;
            }
            return val;
        }

    }

}

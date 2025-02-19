package com.dsa.practices.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeNotes {
    public static void main(String[] args) {
        /*
        A Deque (Double-Ended Queue) is a special type of queue where you can insert and remove elements from both ends (front and rear).
        Unlike a normal queue (FIFO) or a stack (LIFO), a deque provides flexibility for insertion and deletion from both sides.

        Java provides a built-in Deque interface in the java.util package, which is implemented by: ArrayDeque, LinkedList

        Operation	    Description	                        Time Complexity
        insertFront(x)	Insert element x at the front	    O(1)
        isFull()	    Check if the deque is full	        O(1)
        insertLast(x)	Insert element x at the rear	    O(1)
        deleteFront()	Remove element from the front	    O(1)
        deleteLast()    Remove element from the rear	    O(1)
        getFront()	    Get the front element	            O(1)
        getRear()	    Get the last element	            O(1)
        isEmpty()	    Check if the deque is empty	        O(1)

        */

        Deque<Integer> deque = new ArrayDeque<>();

        // Insert elements at both ends
        deque.addFirst(10);  // Front: [10]
        deque.addLast(20);   // Rear: [10, 20]
        deque.addFirst(5);   // Front: [5, 10, 20]

        System.out.println(deque); // Output: [5, 10, 20]

        // Remove elements from both ends
        deque.removeFirst(); // Removes 5 -> [10, 20]
        deque.removeLast();  // Removes 20 -> [10]

        System.out.println(deque.getFirst()); // 10
        System.out.println(deque.getLast());  // 10


    }
}

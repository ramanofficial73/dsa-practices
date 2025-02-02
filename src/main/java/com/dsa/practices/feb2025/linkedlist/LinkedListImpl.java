package com.dsa.practices.feb2025.linkedlist;

public class LinkedListImpl {
    Node head = null;
    Node tail = null;

    void insertAtEnd(String val) {
        Node temp = new Node(val);
        if (head == null && tail == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    void insertAtFirst(String val) {
        Node temp = new Node(val);
        if (head == null && tail == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    boolean isEmpty() {
        return head == null;
    }
}

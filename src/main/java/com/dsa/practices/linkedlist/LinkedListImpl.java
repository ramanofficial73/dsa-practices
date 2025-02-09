package com.dsa.practices.linkedlist;

public class LinkedListImpl {
    Node head = null;
    Node tail = null;

    int size = 0;

    public void insertAtEnd(String val) {
        Node temp = new Node(val);
        if (head == null && tail == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
    }

    public void insertAtFirst(String val) {
        Node temp = new Node(val);
        if (head == null && tail == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public void deleteAt(int idx) {
        Node temp = head;
        if (idx == 0) {
            head = head.next;
            return;
        }
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
    }

    public void insertAtIndex(String val, int index) {
        Node t = new Node(val);
        Node temp = head;
        if (index == size()) {
            insertAtEnd(val);
            return;
        }
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
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

    String getAt(int ind) {
        Node temp = head;
        for (int i = 1; i <= ind; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    boolean isEmpty() {
        return head == null;
    }

}

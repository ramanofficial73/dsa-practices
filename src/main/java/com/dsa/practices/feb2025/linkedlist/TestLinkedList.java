package com.dsa.practices.feb2025.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedListImpl ll = new LinkedListImpl();
        ll.insertAtEnd("Raman");
        ll.insertAtEnd("Raman1");
        ll.insertAtFirst("Sharma");

        ll.display();
        System.out.println();
        System.out.println("Size of LL : " + ll.size());
    }
}

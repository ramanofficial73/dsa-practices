package com.dsa.practices.feb2025.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedListImpl ll = new LinkedListImpl();
        System.out.println("Is Empty list : " + ll.isEmpty());
        ll.insertAtEnd("Raman");
        ll.insertAtEnd("Raman1");
        ll.insertAtFirst("Sharma");

        System.out.println("Is Empty list : " + ll.isEmpty());
        ll.display();
        System.out.println();
        System.out.println("Size of LL : " + ll.size());
    }
}

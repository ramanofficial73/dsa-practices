package com.dsa.practices.feb2025.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedListImpl ll = new LinkedListImpl();
//        System.out.println("Is Empty list : " + ll.isEmpty());
        ll.insertAtEnd("1");
        ll.insertAtEnd("34");
        ll.insertAtFirst("22");
        ll.insertAtFirst("2");

        ll.insertAtIndex("9", 0);

//        System.out.println("Is Empty list : " + ll.isEmpty());
        ll.display();
        System.out.println();
//        System.out.println("Size of LL : " + ll.size());

//        System.out.println(ll.getAt(2));
        ll.deleteAt(1);
        ll.display();

    }
}

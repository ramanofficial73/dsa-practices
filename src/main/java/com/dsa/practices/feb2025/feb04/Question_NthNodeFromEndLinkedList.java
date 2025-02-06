package com.dsa.practices.feb2025.feb04;


public class Question_NthNodeFromEndLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node temp = nthNode(n1, 3);
        System.out.println(temp.data);
    }

    private static Node nthNode(Node head, int idx) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int mth = size - idx + 1;
        temp = head;
        for (int i = 1; i <= mth - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }


}

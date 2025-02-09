package com.dsa.practices.linkedlist;

public class RecursiveLLList {
    public static void main(String[] args) {
        Node a = new Node("1");
        Node b = new Node("2");
        Node c = new Node("3");
        a.next = b;
        b.next = c;
        display(a);
        System.out.println();
        System.out.println("Length of LL : " + length(a));
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        display(node.next);
        System.out.println();
        displayR(node.next);
    }

    public static void displayR(Node node) {
        if (node == null) {
            return;
        }
        display(node.next);
        System.out.print(node.data + " ");
    }

    public static int length(Node node) {
        int count = 0;
        while (node != null) {
            count ++;
            node = node.next;
        }
        return count;
    }
}

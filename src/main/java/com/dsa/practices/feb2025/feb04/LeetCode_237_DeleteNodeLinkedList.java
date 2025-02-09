package com.dsa.practices.feb2025.feb04;

import com.dsa.practices.linkedlist.Node;

public class LeetCode_237_DeleteNodeLinkedList {
    public static void main(String[] args) {
    }

    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }
}

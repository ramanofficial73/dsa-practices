package com.dsa.practices.tree;

public class Question_Tree_NthLevelPrint {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        nthLevel(root, 3);
        System.out.println();
    }

    public static void nthLevel(Node root, int n) {
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.val + " ");
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

}

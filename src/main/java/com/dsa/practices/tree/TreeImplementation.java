package com.dsa.practices.tree;

public class TreeImplementation {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        Node a = new Node(1);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(5);
        Node d = new Node(8);
        a.left = c;
        a.right = d;

        Node e = new Node(3);
        b.right = e;
        display(root);
    }

    public static void size() {

    }
    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + "-> ");
        if (root.left != null) {
            System.out.print(root.left.val + " ");
        } else {
            System.out.print("Nil" + " ");
        }
        if (root.right != null) {
            System.out.print(root.right.val);
        } else {
            System.out.print("Nil" + " ");
        }
        System.out.println();
        display(root.left);
        display(root.right);
    }
}

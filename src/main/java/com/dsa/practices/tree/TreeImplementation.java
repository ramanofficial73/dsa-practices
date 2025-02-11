package com.dsa.practices.tree;

public class TreeImplementation {
    public static int size;

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
        preorder(root);
//        System.out.println(size(root));
//        System.out.println(sumOfTreeNodes(root));
        System.out.println();
        System.out.println(maxValue(root));
        System.out.println(height(root));
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    public static int maxValue(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int a = root.val;
        int b = maxValue(root.left);
        int c = maxValue(root.right);
        return Math.max(a, Math.max(b, c));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int b = height(root.left);
        int c = height(root.right);
        return Math.max(b, c) + 1;
    }

    public static int sumOfTreeNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumOfTreeNodes(root.left) + sumOfTreeNodes(root.right);
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

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        size++;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

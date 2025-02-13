package com.dsa.practices.tree;

public class TreeImplementation {
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
//        preorder(root);
//        System.out.println(size(root));
//        System.out.println(sumOfTreeNodes(root));
        System.out.println();
//        System.out.println(maxValue(root));
//        System.out.println(height(root));
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
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
        //preorder is root left right
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        //inorder is left root right
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void postorder(Node root) {
        //inorder is left right root
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}

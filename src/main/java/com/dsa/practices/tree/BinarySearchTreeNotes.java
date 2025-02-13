package com.dsa.practices.tree;

public class BinarySearchTreeNotes {
    /*
    A Binary Search Tree (BST) is a binary tree where each node has at most two children, and for any node:
        1. The left child contains values smaller than the node’s value.
        2. The right child contains values larger than the node’s value

    Basic Operations on a BST:
    #1. Search
        1. Start from the root.
        2. If the value is less than the current node, move to the left child.
        3. If the value is greater than the current node, move to the right child.
        4. Time Complexity: O(log N) for balanced BST, but in the worst case (unbalanced), it can be O(N).

    #2. Insertion
        1. Start from the root.
        2. Find the correct spot (left or right) by comparing with each node.
        3. Once you reach an empty spot (null), insert the new node.
        4. Time Complexity: O(log N) for balanced BST, but can degrade to O(N) in the worst case.

    #3. Deletion
        1. There are three possible cases:
            a. Node has no children (leaf node): Simply remove the node.
            b. Node has one child: Replace the node with its child.
            c. Node has two children: Find the in-order successor or in-order predecessor and
            replace the node with it. Then, delete the successor or predecessor node.
        2. Time Complexity: O(log N) for balanced BST, but can degrade to O(N) in the worst case.

    #4. In-order Traversal
        1. Visit the left subtree, the node, then the right subtree.
        2. This results in the nodes being visited in ascending order.
        3. Time Complexity: O(N), where N is the number of nodes.

    #5. Pre-order and Post-order Traversal
        1. Pre-order: Visit the node, left subtree, and right subtree.
        2. Post-order: Visit the left subtree, right subtree, then the node.
        3. Both have O(N) time complexity.


    Advantages of BST
    1. Efficient Searching: Search operations are efficient when the tree is balanced.
    2. Sorted Data: In-order traversal gives sorted data.
    3. Efficient Insertion and Deletion: Can add and remove nodes with relative ease compared to other data structures.

    Disadvantages of BST
    2. Unbalanced Tree: If the tree is unbalanced (e.g., inserting in sorted order), it can degrade to a linked list, making the operations inefficient.
    3. Complexity in Balancing: Maintaining a balanced BST requires additional algorithms (e.g., rotations in AVL trees).


    Example of a Binary Search Tree
              50
             /  \
           30    70
          /  \   /  \
         20   40 60   80

    Types of Binary Search Trees:
    #1. Balanced Binary Search Tree:
    A tree in which the height of the left and right subtrees of every node differs by at most 1.
    Examples: AVL Tree, Red-Black Tree.
    Balanced BST ensures O(log N) time complexity for operations.

    #2. Unbalanced Binary Search Tree
    A tree where the height of the left and right subtrees of nodes can vary significantly,
    leading to O(N) time complexity in the worst case (like a linked list).


    Time Complexity:
    1. Search: O(log n) on average for balanced trees, O(n) in the worst case (unbalanced).
    2. Insertion: O(log n) on average for balanced trees, O(n) in the worst case.
    3. Deletion: O(log n) for balanced trees, but can be O(n) in the worst case.


    */
}

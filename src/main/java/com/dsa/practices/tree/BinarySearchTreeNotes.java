package com.dsa.practices.tree;

public class BinarySearchTreeNotes {
    /*
    A Binary Search Tree (BST) is a binary tree data structure in which each node has at most two children,
    referred to as the left and right children. The key property of a BST is:

    1. The left child’s value is less than the parent node’s value.
    2. The right child’s value is greater than the parent node’s value.


    Properties of a BST
    #1. Ordered Structure: For any node, the values in the left subtree are smaller,
    and the values in the right subtree are larger.
    #2. Unique values: No duplicate nodes (though variations allow duplicates).
    #3. Efficient Searching: Searching, insertion, and deletion operations are more efficient than unsorted data structures.

    Basic Operations on a BST
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


    Types of Binary Search Trees
    #1. Balanced Binary Search Tree:
    A tree in which the height of the left and right subtrees of every node differs by at most 1.
    Examples: AVL Tree, Red-Black Tree.
    Balanced BST ensures O(log N) time complexity for operations.

    #2. Unbalanced Binary Search Tree
    A tree where the height of the left and right subtrees of nodes can vary significantly,
    leading to O(N) time complexity in the worst case (like a linked list).


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

    #1. In-order traversal: 20, 30, 40, 50, 60, 70, 80
    #2. Pre-order traversal: 50, 30, 20, 40, 70, 60, 80
    #3. Post-order traversal: 20, 40, 30, 60, 80, 70, 50


    Key Terminology of Binary Search Tree (BST)

    #1. Node
    A node is the basic unit of a tree. Each node contains:
    a. A value (or data).
    b. A left child (pointer to left node).
    c. A right child (pointer to right node).

    #2. Root
    The root node is the topmost node of the tree. It does not have a parent.

    #3. Parent
    A parent node is a node that has one or more child nodes.
    Example: In the tree, 50 is the parent of 30 and 70.

    #4. Child
    A child node is a node that has a parent.
    Example: In the tree, 30 and 70 are the children of 50.

    #5. Sibling
    Siblings are nodes that share the same parent.
    Example: In the tree, 30 and 70 are siblings because they both have 50 as their parent.

    #6. Leaf
    A leaf node is a node that has no children (i.e., both left and right pointers are null).
    Example: In the tree, 20, 40, 60, and 80 are leaf nodes.

    #7. Internal Node
    An internal node is a node that has at least one child.
    Example: In the tree, 50, 30, and 70 are internal nodes.

    #8. Ancestor
    An ancestor of a node is any node that lies on the path from the node to the root of the tree.
    This includes the node’s parent, grandparent, and so on.
    Example: The ancestors of node 20 are 30 and 50.

    #9. Descendants
    A descendant of a node is any node that lies on the path from the node to a leaf node.
    This includes the node’s children, grandchildren, and so on.
    Example: The descendants of node 30 are 20 and 40.


    #10. Height
    The height of a node is the number of edges from that node to the farthest leaf node.
    Example: The height of 30 is 1 (as it has a child 20 or 40).

    #11. Subtree
    A subtree is a tree formed by a node and all its descendants (children, grandchildren, etc.).
    Example: The left subtree of 50 consists of 30, 20, and 40.

    #12. Left Child
    The left child of a node is the node that appears to the left of its parent in the BST,
    and its value is less than the parent node’s value.
    Example: In the tree, 30 is the left child of 50.

    #13. Right Child
    The right child of a node is the node that appears to the right of its parent in the BST,
    and its value is greater than the parent node’s value.
    Example: In the tree, 70 is the right child of 50.

    #14. Depth
    The depth of a node is the number of edges from the root to the node.
    Example: The depth of 20 is 2 (root 50 → 30 → 20).

    */
}

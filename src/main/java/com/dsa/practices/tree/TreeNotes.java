package com.dsa.practices.tree;

public class TreeNotes {
    /*
    A tree is a widely used hierarchical data structure in computer science. It consists of nodes connected by
    edges, where each node represents an entity, and the edges represent relationships between the nodes.
    It is often used to model structures with a hierarchical relationship, like family trees, file systems, and organizational charts.

    Key Properties of a Tree
    1. Each node can have at most two children (left and right).
    2. The topmost node is called the root.
    3. Leaves are nodes with no children.
    4. Each node contains data and pointers to its children.


     Example of Tree:   1
                       / \
                      2   3
                         / \
                        4   5


    Key Terminology of Tree:
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

    #10. Height of a Node
    The number of edges on the longest path from the node to a leaf. A leaf node has height 0.

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

    #15. Level
    All nodes at a given depth in the tree. The root node is at level 0, its children are at level 1, and so on.

    #16. Traversal
    The process of visiting all the nodes in a tree in a specific order. Common traversal methods include:
    1. Inorder: Left -> Root -> Right
    2. Preorder: Root -> Left -> Right
    3. Postorder: Left -> Right -> Root
    4. Level-order: Nodes are visited level by level (usually implemented using a queue).


    Types of Trees:
    1. Binary Tree: A tree where each node has at most two children (left and right).
    2. Binary Search Tree (BST): A binary tree with specific order properties (left children are smaller, right children are larger).
    3. Heap: A complete binary tree used to implement priority queues.
    4. Trie: A tree-like structure used to store a set of strings with a common prefix.
    5. AVL Tree: A self-balancing binary search tree.
    6. B-Tree: A balanced search tree commonly used in databases.

    */
}

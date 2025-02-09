package com.dsa.practices.linkedlist;

public class LinkedListNotes {
    /*
    A Linked List is a linear data structure where elements are stored in nodes,
    and each node points to the next node.
    > Unlike arrays, linked lists are not stored in contiguous memory locations.
    > The size of a linked list is dynamic, unlike arrays which have a fixed size.


    Types of Linked Lists
    #1 Singly Linked List
        1. Each node has two parts:
            a. Data
            b. Next (Pointer to next node)
        2. The last node points to NULL.

    #2 Doubly Linked List (DLL)
        1. Each node has three parts:
            a. Data,
            b. Next (Pointer to next node),
            c. Prev (Pointer to previous node).
        2. Allows traversal in both forward and backward directions.

    #3 Circular Linked List (CLL)
        1. Singly Circular Linked List: Last node points to the first node instead of NULL.
        2. Doubly Circular Linked List: Both next and prev pointers form a circular link.


    Basic Operations in Linked List
    Operation	                Time Complexity (Singly LL)	    Description
    Insertion at Beginning  	O(1)	                        Insert a new node at the head.
    Insertion at End	        O(n)                        	Traverse till the end and add a new node.
    Insertion at Middle     	O(n)	                        Traverse to the required position and insert a node.
    Deletion from Beginning	    O(1)	                        Remove the first node and update head.
    Deletion from End	        O(n)                        	Traverse till the second last node and remove the last node.
    Deletion from Middle	    O(n)	                        Find the required node and remove it.
    Searching an Element	    O(n)	                        Traverse the list to find an element.

    */
}

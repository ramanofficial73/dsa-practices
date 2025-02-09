package com.dsa.practices.stack;

public class StackNotes {

    /*
    A stack is a linear data structure that follows the Last In, First Out (LIFO) principle.
    This means the last element added to the stack is the first one to be removed.

    Basic Operations
    #1. Push → Adds an element to the top of the stack.
    #2. Pop → Removes and returns the top element.
    #3. Peek (or Top) → Returns the top element without removing it.
    #4. isEmpty → Checks if the stack is empty.

    Use Cases of Stack
    #1. Function Call Stack → Used in recursion and method execution.
    #2. Undo/Redo Operations → Used in text editors and applications.
    #3. Expression Evaluation → Used in balancing parentheses, postfix evaluation, etc.
    #4. Depth-First Search (DFS) → Used in graph traversal.

    Stack Implementation Types
    1. Using Arrays → Fixed size, efficient access.
    2. Using Linked List → Dynamic size, extra memory for pointers.

    Key Characteristics
    #1. LIFO Principle → The last element inserted is the first one to be removed.
    #2. Dynamic Size → Can be implemented using arrays or linked lists.
    #3. Efficient Operations → Push and pop operations have O(1) time complexity.
    #4. Limited Access → Only the top element can be accessed directly.
    #5. Memory Utilization → Linked list implementation takes extra memory for pointers.

    Stack Hierarchy Flow
    java.lang.Object → The root class of all Java classes.
        └── java.util.AbstractCollection<E> → Provides a skeletal implementation of the Collection interface.
            └── java.util.AbstractList<E> → Provides a base implementation for list-based collections.
                └── java.util.Vector<E> → A synchronized, growable array of objects.
                    └── java.util.Stack<E> → A specialized subclass of Vector that implements a LIFO stack.


    Stack Internal Working
    #1. Internal Structure:
        #a. The Stack<E> class extends Vector<E>,
        meaning it inherits methods like addElement(), removeElementAt(), and lastElement().
        #b. It follows the LIFO (Last In, First Out) principle.
        #c. Internally, elements are stored in a dynamic array that grows as needed.

    #2. Stack Operations & Internal Flow
        #a. Push Operation (push(E item)):
        Calls addElement(E item) from Vector, which appends the element to the internal array.
        If the internal array is full, Vector dynamically increases its size.

        #b. Pop Operation (pop()):
        Calls peek() to get the last element.
        Removes the last element using removeElementAt(size() - 1).

        #c. Peek Operation (peek()):
        Retrieves the last element using elementAt(size() - 1) without removing it.

        #d. isEmpty Operation (isEmpty())
        Checks if size() == 0.

        #e. Search Operation (search(Object o)):
        Finds the index of an element using lastIndexOf(o) and returns its position from the top.

    */
}

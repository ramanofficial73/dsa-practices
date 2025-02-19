package com.dsa.practices.queue;

public class QueueNotes {
    /* What is a Queue?
    A queue is a linear data structure that follows the FIFO (First In, First Out) principle. This means that the first element added to the queue is the first one to be removed.

    Why Do We Need a Queue?
    Queues are useful when we need to manage elements in the order they were added, such as:

    1. Task scheduling (e.g., CPU scheduling, printer job scheduling)
    2. Handling requests (e.g., web server requests, message processing)
    3. Data buffering (e.g., streaming services, network packets)

    Real-Life Example:
    1. Call Center Support System
    A call center operates on a queue system, where customer calls are answered in a FIFO (First In, First Out) manner.

    Ticket Booking System 🎟️
    A ticket booking system follows a queue mechanism where users book tickets, and requests are processed in FIFO (First In, First Out) order.

    Basic Operations:
    1. Add Element:
    Method	      Behavior	                                        Returns	                                        Throws Exception?
    offer(E e)	  Inserts an element into the queue.	            true if successful, false if queue is full.	    No, safely handles capacity limits.
    add(E e)	  Inserts an element into the queue.	            true if successful.	Yes,                        throws IllegalStateException if queue is full.

    2. Get Element:
    Method	    Behavior	                                        Returns	                                        Throws Exception?
    peek()	    Retrieves the front element without removing it.	Element or null if queue is empty.	            No, returns null if queue is empty.
    element()	Retrieves the front element without removing it.	Element	                                        Yes, throws NoSuchElementException if queue is empty.

    3. Delete Element
    Method	    Behavior	                                        Returns	                                        Throws Exception?
    remove()	Removes and returns the front element.	            Element	                                        Yes, if queue is empty (NoSuchElementException).
    poll()	    Removes and returns the front element.	            Element or null	                                No, returns null if queue is empty.

    4. Check if queue is empty
    isEmpty(): Returns true if queue is empty.

    5. Get queue size
    size(): Returns the number of elements in the queue.

    */
}

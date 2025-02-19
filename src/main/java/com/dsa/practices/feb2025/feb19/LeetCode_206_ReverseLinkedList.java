package com.dsa.practices.feb2025.feb19;

public class LeetCode_206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = reverse;
            reverse = curr;
            curr = temp;
        }
        return reverse;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

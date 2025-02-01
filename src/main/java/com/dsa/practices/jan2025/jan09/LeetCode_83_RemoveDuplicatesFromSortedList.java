package com.dsa.practices.jan2025.jan09;

public class LeetCode_83_RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummay = new ListNode(head.val);
        ListNode ans = dummay;
        ListNode ptr = head.next;

        while (ptr != null) {
            if (ptr.val != dummay.val) {
                ListNode temp =     new ListNode(ptr.val);
                dummay.next = temp;
                dummay = dummay.next;
            }
            ptr = ptr.next;
        }
        return ans;

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

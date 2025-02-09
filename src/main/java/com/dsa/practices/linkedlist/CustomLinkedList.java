package com.dsa.practices.linkedlist;

public class CustomLinkedList {
    public static class TestLL{
        String data;
        TestLL next;

        TestLL(String data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        TestLL a = new TestLL("1");
        TestLL b = new TestLL("2");
        TestLL c = new TestLL("3");

        a.next = b;
        System.out.println(a.next.data);

    }
}

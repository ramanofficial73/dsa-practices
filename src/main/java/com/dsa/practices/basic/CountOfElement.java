package com.dsa.practices.basic;

public class CountOfElement {
    public static void main(String[] args) {
        int n = 124424;
        int count = 0;

        while (n >0) {
            count = count + 1;
            n = n/10;
        }
        System.out.println("Count of numbers : " + count);
    }
}

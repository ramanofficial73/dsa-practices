package com.dsa.practices.jan2025.jan07;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_225_ImplementStackUsingQueues {
    private static Queue<Integer> mainQ;
    private Queue<Integer> temp;

    public static void main(String[] args) {
        LeetCode_225_ImplementStackUsingQueues usingQueues = new LeetCode_225_ImplementStackUsingQueues();
        usingQueues.push(5);
        usingQueues.push(10);
        usingQueues.push(6);
        System.out.println(mainQ);

//        usingQueues.pop();
//        System.out.println(mainQ);

        int top = usingQueues.top();
        System.out.println(top);
    }

    public LeetCode_225_ImplementStackUsingQueues() {
        mainQ = new LinkedList<>();
        temp = new LinkedList<>();
    }

    public void push(int x) {
        // Move all elements from main to temp
        while (mainQ.size() > 0) {
            temp.add(mainQ.remove());
        }

        // addiing in main
        mainQ.add(x);

        while (temp.size() > 0) {
            mainQ.add(temp.remove());
        }
    }

    public int pop() {
        return mainQ.remove();
    }

    public int top() {
        return mainQ.peek();
    }

    public boolean empty() {
        if (mainQ.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

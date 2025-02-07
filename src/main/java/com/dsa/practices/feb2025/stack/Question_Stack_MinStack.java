package com.dsa.practices.feb2025.stack;

import java.util.Stack;

public class Question_Stack_MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> temp = new Stack<>();

    public Question_Stack_MinStack() {

    }

    public void push(int val) {
        if (st.size() == 0) {
            st.push(val);
            temp.push(val);
        } else {
            st.push(val);
            if (temp.peek() < val) {
                temp.push(temp.peek());
            } else {
                temp.push(val);
            }
        }
    }

    public void pop() {
        st.pop();
        temp.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return temp.peek();
    }
}

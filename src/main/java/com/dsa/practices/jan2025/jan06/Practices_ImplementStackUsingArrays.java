package com.dsa.practices.jan2025.jan06;

import java.util.ArrayList;

public class Practices_ImplementStackUsingArrays {
    private ArrayList<String> arrayList;

    public static void main(String[] args) {
        Practices_ImplementStackUsingArrays stackUsingArrays = new Practices_ImplementStackUsingArrays();
        stackUsingArrays.push("raman");
        stackUsingArrays.push("shar,a");
        stackUsingArrays.push("kumar");

        System.out.println(stackUsingArrays);

        System.out.println(stackUsingArrays.isEmpty());
        System.out.println(stackUsingArrays.pop());

        System.out.println(stackUsingArrays.peek());

    }

    public Practices_ImplementStackUsingArrays() {
        arrayList = new ArrayList<>();
    }

    public void push(String value) {
        arrayList.add(value);
    }

    public String peek() {
        return arrayList.get(arrayList.size() - 1);
    }

    public String pop() {
        return arrayList.remove(arrayList.size() - 1);
    }

    public boolean isEmpty() {
        if (arrayList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

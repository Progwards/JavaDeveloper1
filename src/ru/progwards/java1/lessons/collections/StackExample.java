package ru.progwards.java1.lessons.collections;

import java.util.Stack;

public class StackExample {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//        stack.add(4);
//        stack.add(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (var elem : stack) {
            System.out.println(elem);
        }
    }
}

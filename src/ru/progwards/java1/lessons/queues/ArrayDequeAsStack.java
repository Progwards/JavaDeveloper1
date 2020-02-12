package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("мороз");
        stack.push("и");
        stack.push("солнце");
        stack.push("день");
        stack.push("чудесный");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

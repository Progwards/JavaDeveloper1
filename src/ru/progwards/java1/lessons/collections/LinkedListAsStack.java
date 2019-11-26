package ru.progwards.java1.lessons.collections;

import java.util.LinkedList;

public class LinkedListAsStack {
    public static void main(String args[]) {
        LinkedList<Integer> stack = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Помещаем в стек " + i);
            stack.push(i);
        }

        Integer current = stack.poll();
        while (current != null) {
            System.out.println("Взяли из стека " + current);
            current = stack.poll();
        }
    }
}

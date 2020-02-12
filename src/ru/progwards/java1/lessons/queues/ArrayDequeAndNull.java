package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;

public class ArrayDequeAndNull {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        try {
            System.out.println("Пытаемся добавить null через add");
            deque.add(null);
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }

        try {
            System.out.println("Пытаемся добавить null через offer");
            deque.offer(null);
        } catch (NullPointerException e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}

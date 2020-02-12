package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeVsLinkedListAsQueueTest2 {
    static final int ITERATIONS = 25_000_000;
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < ITERATIONS; i++) arrayDeque.offer(i);
        for (int i = 0; i < ITERATIONS; i++) linkedList.offer(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque.poll();
        System.out.println("Получение из ArrayDeque: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) linkedList.poll();
        System.out.println("Получение из LinkedList: " + (System.currentTimeMillis() - start));
    }
}

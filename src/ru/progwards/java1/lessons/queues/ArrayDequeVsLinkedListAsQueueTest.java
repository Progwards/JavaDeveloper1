package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeVsLinkedListAsQueueTest {
    static final int ITERATIONS = 50_000_000;
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque.offer(i);
        System.out.println("Добавление в ArrayDeque: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) linkedList.offer(i);
        System.out.println("Добавление в LinkedList: " + (System.currentTimeMillis() - start));
    }
}

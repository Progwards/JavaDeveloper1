package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;

public class TestArrayDequeAddFirst {
    static final int ITERATIONS = 50_000_000;
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque1.offer(i);
        System.out.println("Добавление в конец: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque2.offerFirst(i);
        System.out.println("Добавление в начало: " + (System.currentTimeMillis() - start));
    }
}

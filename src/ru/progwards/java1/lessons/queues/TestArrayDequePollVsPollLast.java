package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;

public class TestArrayDequePollVsPollLast {
    static final int ITERATIONS = 50_000_000;
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>(ITERATIONS);
        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>(ITERATIONS);

        for (int i = 0; i < ITERATIONS; i++) arrayDeque1.offer(i);
        for (int i = 0; i < ITERATIONS; i++) arrayDeque2.offer(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque1.poll();
        System.out.println("Удаление с конца: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque2.pollLast();
        System.out.println("Удаление из начала: " + (System.currentTimeMillis() - start));
    }
}

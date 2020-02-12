package ru.progwards.java1.lessons.queues;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDequeVsLinkedListAsQueueTest1 {
    static final int ITERATIONS = 50_000_000;
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(ITERATIONS);
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque.offer(i);
        System.out.println("Добавление в ArrayDeque: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) linkedList.offer(i);
        System.out.println("Добавление в LinkedList: " + (System.currentTimeMillis() - start));

        BigInteger bi = new BigInteger("1");
        bi.pow(1);
    }
}

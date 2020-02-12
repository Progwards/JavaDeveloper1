package ru.progwards.java1.lessons.queues;

import java.util.*;

public class PriorityQueueTestContains {
    static final int ELEM_COUNT = 5_000_000;
    public static void main(String[] args) {
        Queue<Double> priQueue = new PriorityQueue<>();
        SortedSet<Double> treeSet = new TreeSet<>();

        Random rnd = new Random();
        for (int i = 0; i < ELEM_COUNT; i++) priQueue.offer(rnd.nextDouble());
        for (int i = 0; i < ELEM_COUNT; i++) treeSet.add(rnd.nextDouble());

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) priQueue.contains(rnd.nextDouble());
        System.out.println("Поиск элементов в PriorityQueue: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) treeSet.contains(rnd.nextDouble());
        System.out.println("Поиск элементов в TreeSet: " + (System.currentTimeMillis() - start));
    }
}

package ru.progwards.java1.lessons.queues;

import java.util.*;

public class PriorityQueueTestCapacity {
    static final int ELEM_COUNT = 5_000_000;
    public static void main(String[] args) {
        Queue<Double> priQueue = new PriorityQueue<>(ELEM_COUNT);
        SortedSet<Double> treeSet = new TreeSet<>();
        ArrayList<Double> arrayList = new ArrayList<>(ELEM_COUNT);

        Random rnd = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) priQueue.offer(rnd.nextDouble());
        System.out.println("Добавление в PriorityQueue: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) treeSet.add(rnd.nextDouble());
        System.out.println("Добавление в TreeSet: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) arrayList.add(rnd.nextDouble());
        Collections.sort(arrayList);
        System.out.println("Добавление и сортировка в ArrayList: " + (System.currentTimeMillis() - start));
    }
}

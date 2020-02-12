package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsAddAll {
    public static void main(String[] args) {
        // пример добавления нескольких объектов
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 2, 1, 4, 5);
        System.out.println(list);

        // пример добавления массива
        Queue<Integer> priQueue = new PriorityQueue<>();
        Integer[] arrInteger = new Integer[list.size()];
        list.toArray(arrInteger);
        Collections.addAll(priQueue, arrInteger);
        System.out.println(priQueue);
    }
}

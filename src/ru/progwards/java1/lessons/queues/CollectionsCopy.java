package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsCopy {
    public static void main(String[] args) {
        // пример добавления нескольких объектов
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 2, 1, 4, 5);
        System.out.println(list);

        // пример копирования списка в другой список
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            linkedList.add(0);

        Collections.copy(linkedList, list);
        System.out.println(linkedList);
    }
}

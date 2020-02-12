package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsFillAndnCopies {
    public static void main(String[] args) {
        // добавление нескольких объектов
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 2, 1, 4, 5);
        System.out.println(list);

        // заполнение коллекции одним объектом
        Collections.fill(list, 5);
        System.out.println(list);

        // создание новой immutable коллекции из 5 одинаковых элементов
        List<Integer> copiesList = Collections.nCopies(5, 10);
        System.out.println(copiesList);
    }
}

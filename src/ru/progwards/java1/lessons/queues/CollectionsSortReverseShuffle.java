package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsSortReverseShuffle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 2, 1, 4, 5);
        System.out.println(list);

        // сортировка
        Collections.sort(list);
        System.out.println(list);

        // сменить порядок на обратный
        Collections.reverse(list);
        System.out.println(list);

        // перемешать в случайном порядке
        Collections.shuffle(list);
        System.out.println(list);
    }
}

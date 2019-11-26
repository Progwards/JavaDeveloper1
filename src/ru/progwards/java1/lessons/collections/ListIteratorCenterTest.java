package ru.progwards.java1.lessons.collections;

import java.util.*;

public class ListIteratorCenterTest {
    static final int ELEMENTS_COUNT = 250_000;

    public static void main(String args[]) {
        List<Integer> arrayList = new ArrayList();
        var startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        System.out.println("Добавление в середину ArrayList: " + (new Date().getTime() - startTime));

        List<Integer> linkedList = new LinkedList();
        startTime = new Date().getTime();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        for (int i = 0; linkedList.size() < ELEMENTS_COUNT; i++) {
            if (listIterator.previousIndex() >= linkedList.size() / 2)
                listIterator.previous();
            listIterator.add(i);
        }
        System.out.println("Добавление в середину LinkedList через итератор: " +
                (new Date().getTime() - startTime));
    }
}

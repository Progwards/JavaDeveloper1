package ru.progwards.java1.lessons.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorChangeList {
    static final int ELEMENTS_COUNT = 5;

    public static void main(String args[]) {
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++)
            linkedList.add(i + 1);

        System.out.println("Список до изменения:");
        for (Integer intObj : linkedList)
            System.out.println("Значение элемента = " + intObj);

        for (ListIterator<Integer> listIterator = linkedList.listIterator(); listIterator.hasNext(); ) {
            Integer intObj = listIterator.next();
            listIterator.set(intObj * intObj);
        }

        System.out.println("\nСписок после изменения:");
        for (Integer intObj : linkedList)
            System.out.println("Значение элемента = " + intObj);
    }
}

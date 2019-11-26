package ru.progwards.java1.lessons.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorForLinkedList {
    static final int ELEMENTS_COUNT = 5;

    public static void main(String args[]) {
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(i + 1);
        }

        System.out.println("Результат с итератором:");
        for (Iterator<Integer> iterator = linkedList.iterator(); iterator.hasNext(); ) {
            Integer intObj = iterator.next();
            System.out.println("Значение элемента = " + intObj);
        }

        System.out.println("Результат с итератором:");
        for (ListIterator<Integer> listIterator = linkedList.listIterator(); listIterator.hasNext(); ) {
            Integer intObj = listIterator.next();
            listIterator.set(5);
            System.out.println("Значение элемента = " + intObj);
        }

        System.out.println("\nРезультат с for-each:");
        for (Integer intObj : linkedList) {
            System.out.println("Значение элемента = " + intObj);
        }
    }
}

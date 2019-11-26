package ru.progwards.java1.lessons.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorRemoveExample {
    static final int ELEMENTS_COUNT = 5;

    public static void main(String args[]) {
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++)
            linkedList.add(i + 1);

        System.out.println("Список до удаления:");
        for (Integer intObj : linkedList)
            System.out.println("Значение элемента = " + intObj);

        for (Iterator<Integer> iterator = linkedList.iterator(); iterator.hasNext(); ) {
            Integer intObj = iterator.next();
            if (intObj % 2 == 0)
                iterator.remove();
        }

        System.out.println("\nСписок после удаления:");
        for (Integer intObj : linkedList)
            System.out.println("Значение элемента = " + intObj);
    }
}

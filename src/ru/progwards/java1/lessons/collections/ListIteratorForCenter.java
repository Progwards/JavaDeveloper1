package ru.progwards.java1.lessons.collections;

import java.util.*;

public class ListIteratorForCenter {
    static final int ELEMENTS_COUNT = 250_000;

    public static void main(String args[]) {
        List<Integer> linkedList = new LinkedList();
        ListIterator<Integer> listIterator = linkedList.listIterator();

        for (int i = 0; linkedList.size() < ELEMENTS_COUNT; i++) {
            if (listIterator.previousIndex() >= linkedList.size() / 2)
                listIterator.previous();
            listIterator.add(i);
        }
    }
}

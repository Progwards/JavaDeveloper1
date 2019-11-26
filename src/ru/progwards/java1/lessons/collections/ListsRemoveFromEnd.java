package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListsRemoveFromEnd {
    static final int ELEMENTS_COUNT = 25_000_000;

    public static void main(String args[]) {
        List<Integer> arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        var startTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            arrayList.remove(i);
        System.out.println("Удаление с конца ArrayList: " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            linkedList.remove(i);
        System.out.println("Удаление с конца LinkedList: " + (new Date().getTime() - startTime));
    }
}

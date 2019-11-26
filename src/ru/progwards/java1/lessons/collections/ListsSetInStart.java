package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListsSetInStart {
    static final int ELEMENTS_COUNT = 1_000_000;

    public static void main(String args[]) {
        List<Integer> arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        var startTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            arrayList.set(0, i);
        System.out.println("Set в начале ArrayList: " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            linkedList.set(0, i);
        System.out.println("Set в начале LinkedList: " + (new Date().getTime() - startTime));
    }
}

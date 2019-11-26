package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListsAddInCenterTest {
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
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        System.out.println("Добавление в середину LinkedList: " + (new Date().getTime() - startTime));
    }
}

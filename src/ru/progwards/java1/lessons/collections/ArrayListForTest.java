package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListForTest {
    static final int ELEMENTS_COUNT = 250_000;

    public static void main(String args[]) {
        var startTime = new Date().getTime();
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
        }
        System.out.println("Добавление: " + (new Date().getTime() - startTime));

        int result = 0;
        startTime = new Date().getTime();
        for (Integer i : arrayList) {
            result += i;
        }
        System.out.println("For each: " + (new Date().getTime() - startTime));

        result = 0;
        startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            result += arrayList.get(i);
        }
        System.out.println("For: " + (new Date().getTime() - startTime));
    }
}

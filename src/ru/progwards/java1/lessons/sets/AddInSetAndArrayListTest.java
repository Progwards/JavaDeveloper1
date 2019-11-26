package ru.progwards.java1.lessons.sets;

import java.util.*;

public class AddInSetAndArrayListTest {
    final static int ELEMENTS_COUNT = 5_000_000;

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Set<Integer> intSet = new HashSet<>();

        var startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            intList.add(i);
        }
        System.out.println("Добавление в ArrayList: " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            intSet.add(i);
        }
        System.out.println("Добавление в HashSet: " + (new Date().getTime() - startTime));
    }
}

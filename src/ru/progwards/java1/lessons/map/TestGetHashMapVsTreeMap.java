package ru.progwards.java1.lessons.map;

import java.util.HashMap;
import java.util.TreeMap;

public class TestGetHashMapVsTreeMap {
    final static int ELEM_COUNT = 5_000_000;
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < ELEM_COUNT; i++) treeMap.put(i, "Строка " + i);
        for (int i = 0; i < ELEM_COUNT; i++) hashMap.put(i, "Строка " + i);

        long start = System.currentTimeMillis();
        for (int j = 0; j < 10; j++)
            for (int i = 0; i < ELEM_COUNT; i++) treeMap.get(i);
        System.out.println("treeMap.get: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int j = 0; j < 10; j++)
            for (int i = 0; i < ELEM_COUNT; i++) hashMap.get(i);
        System.out.println("hashMap.get: " + (System.currentTimeMillis() - start));
    }
}

package ru.progwards.java1.lessons.map;

import java.util.HashMap;
import java.util.Map;

public class MapCopyOf {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) hashMap.put(i, "Строка" + i);
        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> mapCopy = Map.copyOf(hashMap);
        System.out.println("mapCopy = " + mapCopy);

        hashMap.remove(2);
        hashMap.remove(4);

        System.out.println("hashMap = " + hashMap);
        System.out.println("mapCopy = " + mapCopy);
    }
}

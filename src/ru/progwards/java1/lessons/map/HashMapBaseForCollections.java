package ru.progwards.java1.lessons.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBaseForCollections {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) hashMap.put(i, "Строка" + i);
        System.out.println(hashMap);

        Set<Integer> keys = hashMap.keySet();
        Collection<String> collection = hashMap.values();
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        hashMap.remove(2);
        System.out.println(hashMap);

        System.out.println(keys);
        System.out.println(collection);
        System.out.println(entries);
    }
}

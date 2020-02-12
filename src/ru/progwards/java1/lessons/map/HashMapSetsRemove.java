package ru.progwards.java1.lessons.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSetsRemove {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) hashMap.put(i, "Строка" + i);
        System.out.println("hashMap = " + hashMap);

        Set<Integer> keys = hashMap.keySet();
        var entries = hashMap.entrySet();

        keys.remove(2);
        System.out.println("hashMap после keySet.remove = " + hashMap);

        entries.remove(Map.entry(3, "Строка3"));
        System.out.println("hashMap после entries.remove = " + hashMap);

        var entryIterator = entries.iterator();
        while (entryIterator.hasNext()) {
            if (entryIterator.next().getKey() == 4) {
                entryIterator.remove();
                break;
            }
        }
        System.out.println("hashMap после entries.iterator.remove = " + hashMap);
    }
}

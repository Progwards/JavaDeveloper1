package ru.progwards.java1.lessons.map;

import java.util.Collection;
import java.util.HashMap;

public class HashMapValuesAsCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) hashMap.put(i, "Строка" + i);

        Collection<String> collection = hashMap.values();

        System.out.println("foreach:");
        for(String value : collection)
            System.out.println(value);

        System.out.println("\niterator:");
        var iterator = collection.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

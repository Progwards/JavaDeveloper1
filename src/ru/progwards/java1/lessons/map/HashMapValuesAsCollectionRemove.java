package ru.progwards.java1.lessons.map;

import java.util.Collection;
import java.util.HashMap;

public class HashMapValuesAsCollectionRemove {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) hashMap.put(i, "Строка" + i);
        System.out.println(hashMap);

        Collection<String> collection = hashMap.values();

        collection.remove("Строка2");
        collection.remove("Строка4");
        System.out.println("collection после remove = " + collection);
        System.out.println("hashMap после remove = " + hashMap);

        collection.clear();
        System.out.println("collection после clear = " + collection);
        System.out.println("hashMap после clear  = " + hashMap);
    }
}

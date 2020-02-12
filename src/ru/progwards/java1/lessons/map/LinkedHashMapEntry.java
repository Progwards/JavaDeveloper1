package ru.progwards.java1.lessons.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEntry {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Ivanov1", "Иванов Иван Иванович");
        linkedHashMap.put("student1", "Студентов Ученик Изучаевич");
        linkedHashMap.put("UmnikRD", "Умников Раз Думович");
        linkedHashMap.put("tormoz_dk", "Тормозов Диск Колодкович");
        linkedHashMap.put("Student2", "Студентов Ученик Изучаевич");

        for(Map.Entry<String, String> entry : linkedHashMap.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

package ru.progwards.java1.lessons.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntry {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ivanov1", "Иванов Иван Иванович");
        hashMap.put("student1", "Студентов Ученик Изучаевич");
        hashMap.put("UmnikRD", "Умников Раз Думович");
        hashMap.put("tormoz_dk", "Тормозов Диск Колодкович");
        hashMap.put("Student2", "Студентов Ученик Изучаевич");

        for(Map.Entry<String, String> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

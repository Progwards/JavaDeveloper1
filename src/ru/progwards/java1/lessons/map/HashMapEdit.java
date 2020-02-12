package ru.progwards.java1.lessons.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEdit {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ivanov1", "Иванов Иван Иванович");
        hashMap.put("student1", "Студентов Ученик Изучаевич");
        hashMap.put("UmnikRD", "Умников Раз Думович");
        hashMap.put("tormoz_dk", "Тормозов Диск Колодкович");
        hashMap.put("Student2", "Студентов Ученик Изучаевич");

        String oldVal = hashMap.putIfAbsent("Student2", "Студентов Студент Студентович");
        if (oldVal != null)
            System.out.println("Уже есть: " + oldVal);

        for(Map.Entry<String, String> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}

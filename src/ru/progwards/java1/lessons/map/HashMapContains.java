package ru.progwards.java1.lessons.map;

import java.util.HashMap;

public class HashMapContains {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Ivanov1", "Иванов Иван Иванович");
        hashMap.put("student1", "Студентов Ученик Изучаевич");
        hashMap.put("UmnikRD", "Умников Раз Думович");
        hashMap.put("tormoz_dk", "Тормозов Диск Колодкович");
        hashMap.put("Student2", "Студентов Ученик Изучаевич");

        System.out.println(hashMap.containsKey("UmnikRD"));
        System.out.println(hashMap.containsKey("umnikRD"));
        System.out.println(hashMap.containsKey(null));

        System.out.println(hashMap.containsValue("Иванов Иван Иванович"));
        System.out.println(hashMap.containsValue("Студентов Ученик Изучаевич"));
        System.out.println(hashMap.containsValue(null));
    }
}

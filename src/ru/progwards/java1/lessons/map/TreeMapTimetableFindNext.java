package ru.progwards.java1.lessons.map;

import java.util.TreeMap;

public class TreeMapTimetableFindNext {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("08:00", "Утренняя пробежка");
        treeMap.put("13:00", "Забрать машину из сервиса");
        treeMap.put("09:00", "Завтрак");
        treeMap.put("15:00", "Обед");
        treeMap.put("19:30", "Ужин");
        treeMap.put("20:30", "Просмотр фильма");
        treeMap.put("23:00", "Сон");
        treeMap.put("10:00", "Занятия: слушать лекции");
        treeMap.put("16:00", "Занятия: сделать ДЗ");
        treeMap.put("19:15", "Занятия: консультация");
        treeMap.put("14:00", "Прогулка");

        System.out.println(treeMap.ceilingEntry("09:55"));
        System.out.println(treeMap.ceilingEntry("19:25"));
        System.out.println(treeMap.ceilingEntry("23:01"));
    }
}

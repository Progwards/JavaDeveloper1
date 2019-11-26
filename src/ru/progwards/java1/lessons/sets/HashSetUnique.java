package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetUnique {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            stringSet.add("добавим");
            stringSet.add("в");
            stringSet.add("цикле");
            stringSet.add("в");
            stringSet.add("множество");
            stringSet.add("слова");
            stringSet.add("но");
            stringSet.add("одинаковых");
            stringSet.add("не");
            stringSet.add("встретим");
            stringSet.add("даже");
            stringSet.add("два");
        }
        System.out.println(stringSet);
    }
}

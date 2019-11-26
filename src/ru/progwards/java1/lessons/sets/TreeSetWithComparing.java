package ru.progwards.java1.lessons.sets;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithComparing {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(Comparator.comparing(String::length));
        System.out.println(treeSet);
    }
}

package ru.progwards.java1.lessons.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDescending {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);

        System.out.println("Обратный порядок сортировки:");
        Iterator<Integer> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext())
            System.out.println(descIterator.next());
    }
}

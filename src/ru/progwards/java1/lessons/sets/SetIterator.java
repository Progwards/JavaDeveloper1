package ru.progwards.java1.lessons.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class SetIterator {
    final static String TEXT = "на дворе трава на траве дрова не руби дрова на траве двора";

    public static void main(String[] args) {
        HashSet<String> wordSet = new HashSet<>(Arrays.asList(TEXT.split(" ")));
        System.out.println(wordSet);

        for (String word : wordSet)
            System.out.print(word + " ");
        System.out.println();

        Iterator<String> iter = wordSet.iterator();
        while (iter.hasNext())
            System.out.print(iter.next() + " ");
    }
}

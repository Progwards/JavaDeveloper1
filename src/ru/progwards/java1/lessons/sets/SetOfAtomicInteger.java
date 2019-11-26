package ru.progwards.java1.lessons.sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SetOfAtomicInteger {
    public static void main(String[] args) {
        Set<AtomicInteger> setAI = new LinkedHashSet<>();
        setAI.add(new AtomicInteger(1));
        setAI.add(new AtomicInteger(3));
        setAI.add(new AtomicInteger(3));
        setAI.add(new AtomicInteger(3));
        setAI.add(new AtomicInteger(5));
        for (AtomicInteger ai : setAI) {
            System.out.println(ai + ", hashCode=" + ai.hashCode());
        }
        System.out.println(setAI.contains(new AtomicInteger(3)));
    }
}

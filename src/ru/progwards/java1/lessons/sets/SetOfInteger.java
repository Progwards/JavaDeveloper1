package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;

public class SetOfInteger {
    public static void main(String[] args) {
        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(4);
        setInt.add(5);

        for (Integer ai : setInt) {
            System.out.println(ai + ", hashCode=" + ai.hashCode());
        }
    }
}

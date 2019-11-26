package ru.progwards.java1.lessons.sets;

import java.util.Set;

public class SetOfFibo {
    public static void main(String[] args) {
        Set<Integer> fiboSet1000 =
                Set.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987);

        System.out.println(fiboSet1000);

        for (int i = 5; i < 10; i++) {
            System.out.println(i + " " + (fiboSet1000.contains(i) ? "да" : "нет"));
        }
    }
}

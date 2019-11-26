package ru.progwards.java1.lessons.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCopyOf {
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> integerSet2 = Set.copyOf(integerSet1);

        System.out.println("До удаления:");
        System.out.println("integerSet1 = " + integerSet1);
        System.out.println("integerSet2 = " + integerSet2);

        integerSet1.remove(2);
        integerSet1.remove(4);

        System.out.println("После удаления:");
        System.out.println("integerSet1 = " + integerSet1);
        System.out.println("integerSet2 = " + integerSet2);
    }
}

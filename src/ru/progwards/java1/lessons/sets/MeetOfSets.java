package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;

public class MeetOfSets {
    public static HashSet meetOfSets(final Set set1, final Set set2) {
        HashSet result = new HashSet(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> intSet1 = Set.of(1, 2, 3, 4, 5);
        Set<Integer> intSet2 = Set.of(3, 4, 5, 6, 7, 8, 9);

        Set<Integer> meetSet = meetOfSets(intSet1, intSet2);

        System.out.println(intSet1);
        System.out.println(intSet2);
        System.out.println(meetSet);
    }
}

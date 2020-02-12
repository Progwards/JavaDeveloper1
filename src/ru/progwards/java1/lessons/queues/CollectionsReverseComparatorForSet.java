package ru.progwards.java1.lessons.queues;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsReverseComparatorForSet {
    // использование обратного компаратора для Set
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(3, 2, 1, 4, 5));
        System.out.println(set);

        // использование обратного компаратора
        Set<Integer> setReverse = new TreeSet<>(Collections.reverseOrder());
        Collections.addAll(setReverse, 3, 2, 1, 4, 5);
        System.out.println(setReverse);
    }
}

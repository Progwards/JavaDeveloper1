package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsReverseComparatorForList {
    // использование обратного компаратора для списка
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 2, 1, 4, 5);
        System.out.println(list);

        // сортировка с компаратором
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}

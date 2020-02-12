package ru.progwards.java1.lessons.queues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsBinarySearchWithoutSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "без", "труда", "не", "выловишь", "и", "рыбку", "из", "пруда");

        // Быстрый двоичный поиск в списке
        System.out.println(Collections.binarySearch(list, "без"));
        System.out.println(Collections.binarySearch(list, "труда"));
        System.out.println(Collections.binarySearch(list, "не"));
        System.out.println(Collections.binarySearch(list, "выловишь"));
        System.out.println(Collections.binarySearch(list, "и"));
        System.out.println(Collections.binarySearch(list, "рыбку"));
        System.out.println(Collections.binarySearch(list, "из"));
        System.out.println(Collections.binarySearch(list, "пруда"));
    }
}

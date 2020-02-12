package ru.progwards.java1.lessons.queues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsRotate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "без", "труда", "не", "выловишь", "и", "рыбку", "из", "пруда");

        System.out.println(list);

        // циклический сдвиг в списке
        Collections.rotate(list, 4);
        System.out.println(list);
        Collections.rotate(list, -4);
        System.out.println(list);
    }
}

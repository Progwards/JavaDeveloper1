package ru.progwards.java1.lessons.queues;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequency {
    public static void main(String[] args) {
        // пример добавления нескольких объектов
        String text =
                "Если приглашая даму на танец, вы наступили ей на ногу, " +
                "и она сделала вид, что не заметила этого, " +
                "как она заметила, но сделала вид, что не заметила.";

        // убираем точки и запятые
        text = text.replaceAll("[.,]", "").toLowerCase();
        // массив слов в список
        List<String> list = Arrays.asList(text.split(" "));

        // сколько раз в списке встречается элемент
        System.out.println(Collections.frequency(list, "если"));
        System.out.println(Collections.frequency(list, "она"));
        System.out.println(Collections.frequency(list, "заметила"));
    }
}

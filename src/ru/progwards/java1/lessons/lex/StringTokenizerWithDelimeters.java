package ru.progwards.java1.lessons.lex;

import java.util.*;

public class StringTokenizerWithDelimeters {
    public static void wSetTest() {
        String TEXT = "на дворе трава на траве дрова не руби дрова на траве двора";
        Set wordSet = new HashSet<>(Arrays.asList(TEXT.split(" ")));

        Iterator iter = wordSet.iterator();
        while (iter.hasNext())
            if (((String)iter.next()).contains("ра"))
                iter.remove();

        System.out.println(wordSet.size());
    }

    public static void main(String[] args) {
        String txt =
                "StringTokenizer \t - этот класс,\n" +
                "нам строку разобьёт на раз.\r" +
                "Поможет выбрать элементы,\f" +
                "которые нужны к моменту."
        ;
        StringTokenizer tokenizer = new StringTokenizer(txt, "\n\r\f");
        while (tokenizer.hasMoreTokens())
            System.out.println(tokenizer.nextToken());
    }

}

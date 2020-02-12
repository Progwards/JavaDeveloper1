package ru.progwards.java1.lessons.lex;

import java.util.StringTokenizer;

public class StringTokenizerSimple {
    public static void main(String[] args) {
        String txt =
                "StringTokenizer \t - этот класс,\n" +
                "нам строку разобьёт на раз.\r" +
                "Поможет выбрать элементы,\f" +
                "которые нужны к моменту."
        ;
        StringTokenizer tokenizer = new StringTokenizer(txt);
        while (tokenizer.hasMoreTokens())
            System.out.println(tokenizer.nextToken());
    }
}

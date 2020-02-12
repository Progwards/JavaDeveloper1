package ru.progwards.java1.lessons.lex;

import java.util.StringTokenizer;

public class StringTokenizerWithDelimeters2 {
    public static void main(String[] args) {
        String txt =
                "StringTokenizer \t - этот класс,\n" +
                "нам строку разобьёт на раз.\r" +
                "Поможет выбрать элементы,\f" +
                "которые нужны к моменту."
        ;
        StringTokenizer tokenizer = new StringTokenizer(txt, " \t\n\r\f.,-");
        System.out.println("Всего слов: " + tokenizer.countTokens());
        while (tokenizer.hasMoreTokens())
            System.out.println(tokenizer.nextToken());
        System.out.println("Осталось слов: " + tokenizer.countTokens());
    }
}

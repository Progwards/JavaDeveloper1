package ru.progwards.java1.lessons.lex;

import java.util.StringTokenizer;

public class StringTokenizerWithDelimetersAsWords {
    public static void println(String str) {
        switch (str) {
            case " ": break;
            case "\f": System.out.println("\\f"); break;
            case "\n": System.out.println("\\n"); break;
            case "\r": System.out.println("\\r"); break;
            case "\t": System.out.println("\\t"); break;
            default:
                System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String txt =
                "StringTokenizer \t - этот класс,\n" +
                "нам строку разобьёт на раз.\r" +
                "Поможет выбрать элементы,\f" +
                "которые нужны к моменту."
        ;
        StringTokenizer tokenizer =
                new StringTokenizer(txt, " \t\n\r\f.,-", true);
        while (tokenizer.hasMoreTokens())
            println(tokenizer.nextToken());
    }
}

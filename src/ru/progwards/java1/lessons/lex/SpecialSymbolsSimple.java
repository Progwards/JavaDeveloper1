package ru.progwards.java1.lessons.lex;

public class SpecialSymbolsSimple {
    public static void main(String[] args) {
        String txt =
                "StringTokenizer \t - этот класс,\n" +
                "нам строку разобьёт на раз.\r" +
                "Поможет выбрать элементы,\f" +
                "которые нужны к моменту."
        ;
        System.out.println(txt);
    }
}

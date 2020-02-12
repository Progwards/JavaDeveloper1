package ru.progwards.java1.lessons.io.lec1;

import java.io.PrintStream;

public class StreamsErr {
    public static void main(String[] args) {
        System.err.println("Что такое System.err?");

        PrintStream printStream = System.err;
        printStream.println("Это");
        printStream.println("поток");
        printStream.println("для");
        printStream.println("вывода");
        printStream.println("ошибок.");
    }
}

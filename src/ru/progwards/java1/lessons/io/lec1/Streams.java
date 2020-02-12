package ru.progwards.java1.lessons.io.lec1;

import java.io.PrintStream;

public class Streams {
    public static void main(String[] args) {
        System.out.println("Что такое System.out?");

        PrintStream printStream = System.out;
        printStream.println("Это");
        printStream.println("поток");
        printStream.println("для");
        printStream.println("стандартного");
        printStream.println("вывода.");
    }
}

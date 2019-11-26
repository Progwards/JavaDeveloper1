package ru.progwards.java1.lessons.exceptions;

public class ThrowsAnyLevels {
    public static void functionA() {
        System.out.println("functionA старт");
        functionB();
        System.out.println("functionA финиш");
    }

    public static void functionB() {
        System.out.println("functionB старт");
        functionC();
        System.out.println("functionB финиш");
    }

    public static void functionC() {
        System.out.println("functionC старт");
        int x = 1/0;
        System.out.println("functionC финиш");
    }

    public static void main(String[] args) {
        try {
            functionA();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

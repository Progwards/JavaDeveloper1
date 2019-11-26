package ru.progwards.java1.lessons.exceptions;

import java.util.Date;

public class ExceptionOrCompare {
    public static void main(String[] args) {
        Object objectNull = null;
        long startTime = new Date().getTime();
        for (int i = 0; i < 1_000_000; i++) {
            if (objectNull != null) {
                objectNull.toString();
            }
        }
        System.out.println("Сравнение: " + (new Date().getTime() - startTime) + " мс");

        startTime = new Date().getTime();
        for (int i = 0; i < 1_000_000; i++) {
            try {
                objectNull.toString();
            } catch (Exception e) {
            }
        }
        System.out.println("Исключение: " + (new Date().getTime() - startTime) + " мс");
    }
}

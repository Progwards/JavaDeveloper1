package ru.progwards.java1.lessons.classes3;

import java.math.BigDecimal;
import java.util.Date;

public class BigDecimalAndDoubleSpeedTest {
    final static int ITERATION_COUNT = 100_000_000;

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        long startTime = new Date().getTime();
        BigDecimal result = new BigDecimal(0);
        for (int i = 0; i < ITERATION_COUNT; i++) {
            result = result.add(new BigDecimal("0.01"));
        }
        System.out.println("BigDecimal: " + (new Date().getTime() - startTime) + " мс, результат: " + result);

        startTime = new Date().getTime();
        double doubleRes = 0.0;
        for (int i = 0; i < ITERATION_COUNT; i++) {
            doubleRes += 0.01;
        }
        System.out.println("double: " + (new Date().getTime() - startTime) + " мс, результат: " + doubleRes);
    }
}

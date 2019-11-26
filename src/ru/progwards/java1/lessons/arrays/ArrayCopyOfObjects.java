package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayCopyOfObjects {
    public static void main(String[] args) {
        AtomicInteger[] arrayInt = {
                new AtomicInteger(-7),
                new AtomicInteger(5),
                new AtomicInteger(0),
                new AtomicInteger(58),
                new AtomicInteger(-1)};
        AtomicInteger[] arrayIntCopy =
                Arrays.copyOf(arrayInt, arrayInt.length);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0].set(55555);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}

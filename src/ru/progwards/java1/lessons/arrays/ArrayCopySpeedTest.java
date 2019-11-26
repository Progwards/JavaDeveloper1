package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;
import java.util.Date;

public class ArrayCopySpeedTest {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[1000000];
        Integer[] newArray = new Integer[1000000];
        var startTime = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            newArray = Arrays.copyOf(intArray, intArray.length);
        }
        System.out.println("Arrays.copyOf(): " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = 0; i < 10000; i++) {
            System.arraycopy(intArray, 0, newArray, 0, intArray.length);
        }
        System.out.println("System.arraycopy(): " + (new Date().getTime() - startTime));
    }
}

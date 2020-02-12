package ru.progwards.java1.lessons.random;

import java.util.Arrays;
import java.util.Random;

public class UtilRandomStream {
    public static void main(String[] args) {
        long size = 25;
        int[] intArr = new Random().ints(size, 0, 25).toArray();
        System.out.println("intArr = " + Arrays.toString(intArr));

        double[] doubleArr = new Random().doubles(5, -10, 10).toArray();
        System.out.println("doubleArr = " + Arrays.toString(doubleArr));
    }
}

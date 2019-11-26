package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];

        System.out.println(Arrays.toString(arrayInt));

        Arrays.fill(arrayInt, -1);

        System.out.println(Arrays.toString(arrayInt));
    }
}

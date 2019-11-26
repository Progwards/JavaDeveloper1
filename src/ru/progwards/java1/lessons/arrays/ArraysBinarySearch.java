package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] arrayInt = {-7, 5, 0, 58, -1};

        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Номер элемента: " + Arrays.binarySearch(arrayInt, 5));

        Arrays.sort(arrayInt);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println("Номер элемента: " + Arrays.binarySearch(arrayInt, 5));
    }
}

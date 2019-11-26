package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] arrayInt = {-7, 5, 0, 58, -1};
        int[] arrayIntCopy = arrayInt;

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0] = 55555;

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}

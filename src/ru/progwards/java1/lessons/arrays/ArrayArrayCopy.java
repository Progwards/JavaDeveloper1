package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArrayArrayCopy {
    public static void main(String[] args) {
        int[] arrayInt = {-7, 5, 0, 58, -1};
        int[] arrayIntCopy = new int[arrayInt.length];
        System.arraycopy(arrayInt, 0, arrayIntCopy, 0, arrayInt.length);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0] = 55555;

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}

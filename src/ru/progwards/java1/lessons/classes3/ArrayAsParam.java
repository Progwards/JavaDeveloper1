package ru.progwards.java1.lessons.classes3;

import java.util.Arrays;

public class ArrayAsParam {
    static void arrayAsParam(int[] intArray) {
        intArray[0] = 2019;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(intArray));
        arrayAsParam(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}

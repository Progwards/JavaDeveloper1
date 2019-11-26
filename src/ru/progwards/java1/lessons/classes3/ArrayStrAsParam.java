package ru.progwards.java1.lessons.classes3;

import java.util.Arrays;

public class ArrayStrAsParam {
    static void arrayStrAsParam(String[] intArray) {
        intArray[0] = "Строка2019";
    }

    public static void main(String[] args) {
        String[] intArray = {"Строка1", "Строка2", "Строка3", "Строка4", "Строка5"};
        System.out.println(Arrays.toString(intArray));
        arrayStrAsParam(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}

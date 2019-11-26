package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraysDeepEquals {
    public static void main(String[] args) {
        int[] arrayInt1 = {1, 2, 3, 4, 5};
        int[] arrayInt2 = {5, 4, 3, 2, 1};
        int[] arrayInt3 = {1, 2, 3, 4, 5};
        int[][] arrayInt2D_1 = {arrayInt1, arrayInt2, arrayInt3};
        int[][] arrayInt2D_2 = {arrayInt1, arrayInt2, arrayInt1};

        System.out.println(Arrays.toString(arrayInt2D_1));
        System.out.println(Arrays.toString(arrayInt2D_2));
        System.out.println(Arrays.equals(arrayInt2D_1, arrayInt2D_2));

        System.out.println(Arrays.deepToString(arrayInt2D_1));
        System.out.println(Arrays.deepToString(arrayInt2D_2));
        System.out.println(Arrays.deepEquals(arrayInt2D_1, arrayInt2D_2));
    }
}

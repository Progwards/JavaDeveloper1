package ru.progwards.java1.lessons.arrays;

public class PrintArray {
    private static void printArray(int[] intArray) {
        for (int value : intArray) {
            System.out.println("Элемент " + value);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] simpleArray1 = {21, 34, 55, 89, 144};
        int simpleArray2[] = {144, 34, 55, 89, 21};
        int[] simpleArray3 = new int[5];

        printArray(simpleArray1);
        printArray(simpleArray2);
        printArray(simpleArray3);
    }
}

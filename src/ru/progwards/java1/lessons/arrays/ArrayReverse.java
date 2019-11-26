package ru.progwards.java1.lessons.arrays;

public class ArrayReverse {
    private static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Элемент " + i + " = " + intArray[i]);
        }
        System.out.println();
    }

    public static int[] reverse(int[] originalArray) {
        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[originalArray.length - 1 - i] = originalArray[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] simpleArray = {21, 34, 55, 89, 144};

        int[] reversedArray = reverse(simpleArray);

        printArray(simpleArray);
        printArray(reversedArray);
    }
}

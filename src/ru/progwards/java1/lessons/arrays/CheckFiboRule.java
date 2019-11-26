package ru.progwards.java1.lessons.arrays;

public class CheckFiboRule {
    private static boolean checkFibo(int[] intArray) {
        for (int i = 2; i < intArray.length; i++) {
            if (intArray[i - 2] + intArray[i - 1] != intArray[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] simpleArray1 = {21, 34, 55, 89, 144};
        int simpleArray2[] = {144, 34, 55};
        int[] simpleArray3 = new int[4];

        int[][] intArray2D = {simpleArray1, simpleArray2, simpleArray3};

        System.out.println("intArray2D.length = " + intArray2D.length);

        for (int i = 0; i < intArray2D.length; i++) {
            System.out.println("Длина массива " + i + " = " + intArray2D[i].length);
            System.out.println("checkFibo " + i + " = " + checkFibo(intArray2D[i]));
        }
    }
}
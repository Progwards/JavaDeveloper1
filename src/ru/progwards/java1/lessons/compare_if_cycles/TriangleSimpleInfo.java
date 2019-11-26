package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        int max = 0;
        if (a > b)
            max = a;
        else
            max = b;
        if (max < c)
            max = c;

        return max;
    }

    public static int minSide(int a, int b, int c) {
        int min = 0;
        if (a < b)
            min = a;
        else
            min = b;

        if (min > c)
            min = c;

        return min;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return a == b && a == c;
    }

    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        System.out.println(maxSide(a, b, c));
        System.out.println(minSide(a, b, c));
        System.out.println(isEquilateralTriangle(a, b, c));
    }
}

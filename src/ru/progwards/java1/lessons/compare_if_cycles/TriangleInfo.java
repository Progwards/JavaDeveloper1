package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b <= c)
            return false;
        if (a + c <= b)
            return false;
        if (b + c <= a)
            return false;

        return true;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if (a*a + b*b == c*c)
            return true;

        if (a*a + c*c == b*b)
            return true;

        if (b*b + c*c == a*a)
            return true;

        return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if ((isTriangle(a, b, c)) && (a == b || a == c || c == b))
            return true;

        return false;
    }

    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        System.out.println(isTriangle(a, b, c));
        System.out.println(isRightTriangle(a, b, c));
        System.out.println(isIsoscelesTriangle(a, b, c));
    }
}

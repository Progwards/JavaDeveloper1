package ru.progwards.java1.lessons.classes.lesson.presentation;

public class StaticTriangles {
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double area(double a, double b, double c) {
        // считаем по формуле Герона
        double hP = perimeter(a, b, c) / 2;
        return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
    }

    public static void main(String[] args) {
        double a1 = 3, b1 = 4, c1 = 5;
        double a2 = 5, b2 = 5, c2 = 5;
        double a3 = 5, b3 = 3, c3 = 5;

        System.out.println("Периметр triangle1 = " + perimeter(a1, b1, c1));
        System.out.println("Площадь triangle1 = " + area(a1, b1, c1));

        System.out.println("Периметр triangle2 = " + perimeter(a2, b2, c2));
        System.out.println("Площадь triangle2 = " + area(a2, b2, c2));

        System.out.println("Периметр triangle3 = " + perimeter(a3, b3, c3));
        System.out.println("Площадь triangle3 = " + area(a3, b3, c3));
    }
}

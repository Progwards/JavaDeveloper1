package ru.progwards.java1.lessons.classes.presentation;

public class Triangle {
    // свойства
    private double a, b, c;
    public boolean isOk = false;

    // конструкторы
    public Triangle() {
        isOk = a + b > c && a + c > b && b + c > a;
    }

    public Triangle(double a, double b, double c) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle makeTriangle(double a, double b, double c) {
        Triangle result = new Triangle(a, b, c);
        if (!result.isOk)
            return null;
        return result;
    }

    // методы
    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        // считаем по формуле Герона
        double hP = perimeter() / 2;
        return Math.sqrt(hP * (hP - a) * (hP - b) * (hP - c));
    }
}

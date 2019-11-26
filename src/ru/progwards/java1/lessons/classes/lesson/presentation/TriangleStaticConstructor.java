package ru.progwards.java1.lessons.classes.lesson.presentation;

public class TriangleStaticConstructor {
    public static void main(String[] args) {
        Triangle triangle1 = Triangle.makeTriangle(3, 4, 5);

        if (triangle1 == null) {
            System.out.println("Треугольника с такими сторонами не существует");
        } else {
            System.out.println("Периметр triangle2 = " + triangle1.perimeter());
            System.out.println("Площадь triangle2 = " + triangle1.area());
        }
    }
}

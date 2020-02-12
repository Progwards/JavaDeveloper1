package ru.progwards.java1.lessons.classes.presentation;

public class UseOfTriange {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(5, 5, 5);
        Triangle triangle3 = new Triangle(5, 3, 5);

        System.out.println("Периметр triangle1 = " + triangle1.perimeter());
        System.out.println("Площадь triangle1 = " + triangle1.area());

        System.out.println("Периметр triangle2 = " + triangle2.perimeter());
        System.out.println("Площадь triangle2 = " + triangle2.area());

        System.out.println("Периметр triangle3 = " + triangle3.perimeter());
        System.out.println("Площадь triangle3 = " + triangle3.area());
    }
}

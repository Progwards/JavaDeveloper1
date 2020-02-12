package ru.progwards.java1.lessons.arrays;

import ru.progwards.java1.lessons.classes.figures.Circle;

public class CircleCompare {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);

        System.out.println(circle1 == circle2);
        System.out.println(circle1.equals(circle2));
    }
}

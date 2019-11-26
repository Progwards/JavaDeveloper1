package ru.progwards.java1.lessons.classes2;

import java.util.Arrays;
import static ru.progwards.java1.lessons.classes2.NestedFigures.*;

public class DemoNestedFromOtherClass {
    public static void main(String[] args) {
        Segment segment = new Segment(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 11);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

        Figure[] figures = {segment, square, rectangle, circle, triangle};

        Arrays.sort(figures);

        for (var figure: figures) {
            printInfo(figure);
        }
    }
}

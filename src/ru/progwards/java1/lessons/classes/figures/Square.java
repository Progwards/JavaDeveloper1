package ru.progwards.java1.lessons.classes.figures;

public class Square extends Segment {
    Square(double a) {
        super(a);
    }

    @Override
    double area() {
        return a * a;
    }

    @Override
    double perimeter() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Квадрат " + a + " x " + a;
    }
}

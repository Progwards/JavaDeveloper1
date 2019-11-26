package ru.progwards.java1.lessons.classes.lesson.figures;

public class Segment extends Figure {
    double a;

    Segment(double a) {
        this.a = a;
    }

    @Override
    double perimeter() {
        return a;
    }

    @Override
    public String toString() {
        return "Отрезок, длина " + a;
    }
}

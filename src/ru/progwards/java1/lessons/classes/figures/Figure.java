package ru.progwards.java1.lessons.classes.figures;

public abstract class Figure implements Comparable<Figure> {
    @Override
    public int compareTo(Figure figure) {
        return Double.compare(this.area(), figure.area());
    }

    // периметр фигуры
    abstract double perimeter();

    // площадь фигуры
    double area() {
        return 0d;
    }
}

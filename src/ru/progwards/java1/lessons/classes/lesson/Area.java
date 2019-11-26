package ru.progwards.java1.lessons.classes.lesson;

public class Area {
    Position position;
    double radius = 0.25; // радиус в метрах

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }
}

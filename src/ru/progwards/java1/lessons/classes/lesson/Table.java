package ru.progwards.java1.lessons.classes.lesson;

public class Table {
    Position position;
    double radius = 0.75; // в метрах

    Chair chair1;
    Chair chair2;
    Chair chair3;

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }
}


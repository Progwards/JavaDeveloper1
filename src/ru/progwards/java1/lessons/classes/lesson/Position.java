package ru.progwards.java1.lessons.classes.lesson;

// координаты точки на поверхности
public class Position {
    double lat; // широта
    double lon; // долгота

    // попадание otherPosition в окружность с радиусом radius
    public boolean inRadius(Position otherPosition, double radius) {
        double latDiff = lat - otherPosition.lat;
        double lonDiff = lon - otherPosition.lon;
        return latDiff * latDiff + lonDiff * lonDiff <= radius;
    }
}

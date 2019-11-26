package ru.progwards.java1.lessons.classes.lesson;

public class Plate {
    int id;
    Position position;
    double volume = 1000; // максимальный объём в мл

    public Plate(int id) {
        this.id = id;
    }

    boolean isEmpty() {
        return Detector.plateIsEmtpy(id);
    }
}

package ru.progwards.java1.lessons.classes;

public class Chair extends Area {
    int id;
    Person person;
    Plate plate;

    public Chair(int id) {
        this.id = id;
        radius = 0.25; // радиус в метрах
    }

    boolean isEmpty() {
        return Detector.chairIsEmtpy(id);
    }

    void detectPerson() {
        double personOnChairWeight = Detector.personOnChairWeight(id);
        if (personOnChairWeight < 30)
            // ребёнок
            person = new Person(PersonType.CHILD, personOnChairWeight);
        else if (personOnChairWeight > 50)
            // папа
            person = new Person(PersonType.FATHER, personOnChairWeight);
        else
            // мама
            person = new Person(PersonType.MOTHER, personOnChairWeight);
    }
}


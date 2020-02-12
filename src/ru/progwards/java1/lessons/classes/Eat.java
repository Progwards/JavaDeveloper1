package ru.progwards.java1.lessons.classes;

enum EatType {
    NOTHING,
    SOUP,
    ENTREE,
    DESSERT,
    DINNER_IS_OVER
}

public class Eat {
    Position position;
    double radius = 0.15; // в метрах
    EatType type; // тип еды
    double volume; // начальный объём в мл
    private double eaten = 0; // сколько съедено

    Eat(EatType type, double volume) {
        this.type = type;
        this.volume = volume;
    }

    boolean inArea(Position otherPosition) {
        return position.inRadius(otherPosition, radius);
    }

    double volumeNow() {
        return volume - eaten;
    }

    double getEat(double portionVolume) {
        if (volumeNow() < portionVolume) {
            // недостаточный объём для выдачи порции
            portionVolume = volumeNow();
        }
        eaten += portionVolume;
        return portionVolume;
    }

    static Eat selectEatByType(EatType eatType, Eat eat1, Eat eat2, Eat eat3) {
        if (eat1.type == eatType)
            return eat1;
        if (eat2.type == eatType)
            return eat2;
        return eat3;
    }
}

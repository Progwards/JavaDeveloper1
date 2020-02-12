package ru.progwards.java1.lessons.classes;

enum PersonType {
    FATHER,
    MOTHER,
    CHILD
}

public class Person {
    PersonType type;
    double weight;
    EatType lastEatType = EatType.NOTHING;

    Person(PersonType personType, double personWeight) {
        type = personType;
        weight = personWeight;
    }

    EatType nextEatType() {
        switch (lastEatType) {
            case NOTHING: return EatType.SOUP;
            case SOUP: return EatType.ENTREE;
            case ENTREE: return EatType.DESSERT;
            case DESSERT: return EatType.DINNER_IS_OVER;
            default: return EatType.DINNER_IS_OVER;
        }
    }

    double eatQuantity(EatType eatType) {
        switch (eatType) {
            case SOUP: return weight / 150;
            case ENTREE: return weight / 150;
            case DESSERT: return weight / 300;
            default: return 0;
        }
    }
}

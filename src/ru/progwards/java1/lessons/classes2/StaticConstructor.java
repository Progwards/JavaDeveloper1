package ru.progwards.java1.lessons.classes2;

public class StaticConstructor {
    static String staticString = "Значение присвоено при описании переменной";
    static {
        staticString = "Значение присвоено в статическом конструкторе класса";
    }

    public static void main(String[] args) {
        System.out.println(StaticConstructor.staticString);
    }
}

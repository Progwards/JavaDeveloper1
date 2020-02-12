package ru.progwards.java1.lessons.random;

public class MathRandomSimple {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            double rand = Math.random();
            System.out.println("Math.random() = " + rand);
        }
    }
}

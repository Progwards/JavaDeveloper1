package ru.progwards.java1.lessons.classes2;

public class SaticMethodFromWrapper {
    public static void main(String[] args) {
        double a = 1.2345;
        double b = 5.4321;

        Double objA = 55.555;

        double maxAB = Double.max(a, b);

        System.out.println("maxAB = " + maxAB);
    }
}

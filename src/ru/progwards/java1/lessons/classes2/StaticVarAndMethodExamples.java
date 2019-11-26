package ru.progwards.java1.lessons.classes2;

public class StaticVarAndMethodExamples {
    public static void main(String[] args) {
        double a = 5.0, b = -5.0;

        double minAB = Math.min(a, b);
        double maxAB = Math.max(a, b);
        System.out.println("minAB = " + minAB);
        System.out.println("maxAB = " + maxAB);
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.sqrt(b * b) = " + Math.sqrt(b * b));

        int compareAB = Double.compare(a, b);
        System.out.println("compareAB = " + compareAB);
    }
}

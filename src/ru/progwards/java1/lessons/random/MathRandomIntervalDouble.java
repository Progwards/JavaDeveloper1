package ru.progwards.java1.lessons.random;

public class MathRandomIntervalDouble {
    public static final double mathRandomInterval(double min, double max) {
        return Math.random() * (max - min) + min;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            double rand = mathRandomInterval(5, 10);
            System.out.println("mathRandomInterval(5, 10) = " + rand);
        }
    }
}

package ru.progwards.java1.lessons.random;

public class MathRandomIntervalInt {
    public static final int mathRandomInterval(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int rand = mathRandomInterval(5, 10);
            System.out.println("mathRandomInterval(5, 10) = " + rand);
        }
    }
}

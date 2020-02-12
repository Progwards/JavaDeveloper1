package ru.progwards.java1.lessons.random;

public class MathRandomIntervalIntSigned {
    public static final int mathRandomInterval(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int rand = mathRandomInterval(-10, 10);
            System.out.println("mathRandomInterval(-10, 10) = " + rand);
        }
    }
}

package ru.progwards.java1.lessons.random;

import java.util.Random;

public class UtilRandomInterval {
    static Random random = new Random();

    public static final int randomInterval(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("randomInterval(5, 10) = " + randomInterval(5, 10));
        }
    }
}

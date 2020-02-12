package ru.progwards.java1.lessons.random;

import java.util.Random;

public class UtilRandomNextIntBound {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randInt = random.nextInt(10);
            System.out.println("random.nextInt(10) = " + randInt);
        }
    }
}

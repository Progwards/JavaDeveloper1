package ru.progwards.java1.lessons.random;

import java.util.Random;

public class UtilRandomSimple {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randInt = random.nextInt();
            System.out.println("random.nextInt() = " + randInt);
        }
    }
}

package ru.progwards.java1.lessons.random;

import java.util.Random;

public class UtilRandomDouble {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++)
            System.out.println("random.nextDouble() = " + random.nextDouble());
        for (int i = 0; i < 5; i++)
            System.out.println("random.nextFloat() = " + random.nextFloat());
    }
}

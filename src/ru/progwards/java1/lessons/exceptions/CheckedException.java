package ru.progwards.java1.lessons.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("?????", false);
            try {
                writer.write("Какая-то строка");
            } catch (IOException e) {
                System.out.println(e);
            } finally {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package ru.progwards.java1.lessons.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {
    public static void createFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, false);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Невозможно создать файл " + fileName);
        }
    }

    public static void main(String[] args) {
        try {
            createFile("?????");
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}

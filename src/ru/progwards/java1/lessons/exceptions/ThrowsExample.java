package ru.progwards.java1.lessons.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowsExample {
    public static void createFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName, false);
        writer.close();
    }

    public static void main(String[] args) {
        try {
            createFile("?????");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package ru.progwards.java1.lessons.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileAndWriteWithTry {
    public static void createFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName, false);
        try {
            writer.write("Какая-то строка");
        } finally {
            writer.close();
        }
    }

    public static void main(String[] args) {
        try {
            createFile("?????");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

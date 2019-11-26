package ru.progwards.java1.lessons.io.presentation.lec1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCharFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("file1.txt");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String strFromFile = scanner.nextLine();
            System.out.println(strFromFile);
        }
        reader.close();
    }
}

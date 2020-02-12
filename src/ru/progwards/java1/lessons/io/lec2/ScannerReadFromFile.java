package ru.progwards.java1.lessons.io.lec2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReadFromFile {
    public static void main(String[] args) {
        File file = new File("C:/Projects/Academy/Java1/file1.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

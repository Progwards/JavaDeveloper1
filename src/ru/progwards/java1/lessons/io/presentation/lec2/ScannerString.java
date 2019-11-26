package ru.progwards.java1.lessons.io.presentation.lec2;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        String str = "Эта строка состоит из 5 слов";

        try(Scanner scanner = new Scanner(str)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                System.out.println("Слово " + word);
            }
        }
    }
}

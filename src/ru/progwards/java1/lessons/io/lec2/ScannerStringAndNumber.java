package ru.progwards.java1.lessons.io.lec2;

import java.util.Scanner;

public class ScannerStringAndNumber {
    public static void main(String[] args) {
        String str = "Эта строка состоит из 5 слов";

        try(Scanner scanner = new Scanner(str)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    System.out.println("Число " + num);
                } else {
                    String word = scanner.next();
                    System.out.println("Слово " + word);
                }
            }
        }
    }
}

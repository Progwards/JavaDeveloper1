package ru.progwards.java1.lessons.io.presentation.lec2;

import java.util.Scanner;

public class ScannerNumberStringWithDelimiter {
    public static void main(String[] args) {
        String str = "1, 2, 3,4 ,5  ,    6,7,8, 9, 10  , ";
        try(Scanner scanner = new Scanner(str).useDelimiter("\\s*,\\s*")) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.println("Число " + num);
            }
        }
    }
}

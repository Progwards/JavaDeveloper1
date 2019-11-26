package ru.progwards.java1.lessons.exceptions;

public class Exception3 {
    static int finallyResearch() {
        try {
            System.out.println("try");
            int e = 1 / 0;
            return 1;
        } catch(Exception e) {
            System.out.println("catch");
            return 2;
        } finally {
            System.out.println("finally");
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(finallyResearch());
    }
}

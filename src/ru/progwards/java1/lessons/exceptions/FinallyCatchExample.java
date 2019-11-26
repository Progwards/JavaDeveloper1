package ru.progwards.java1.lessons.exceptions;

public class FinallyCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            int x = 1 / 0;
        } catch(Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}

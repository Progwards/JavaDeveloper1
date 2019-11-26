package ru.progwards.java1.lessons.exceptions;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        } catch(Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}

package ru.progwards.java1.lessons.classes2;

public class StringHashCodes {
    public static void printStrAndHash(String str) {
        System.out.println(str.hashCode() + " " + str);
    }

    public static void main(String[] args) {
        printStrAndHash("Зачем");
        printStrAndHash("нужны");
        printStrAndHash("хеш-таблицы?");
        printStrAndHash("Чтобы");
        printStrAndHash("поиск");
        printStrAndHash("летал");
        printStrAndHash("как");
        printStrAndHash("птица.");
    }
}

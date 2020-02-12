package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;

public class ArrayDequeAndNull1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        try {
            System.out.println("Пытаемся посмотреть первый элемент пустой очереди через element");
            System.out.println("Первый элемент очереди = " + deque.element());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Пытаемся взять элемент из пустой очереди через remove");
            System.out.println("Взят элемент очереди = " + deque.remove());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

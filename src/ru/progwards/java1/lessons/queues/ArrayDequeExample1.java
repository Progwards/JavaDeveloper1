package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ArrayDequeExample1 {
    public static void main(String[] args) {

        // Create an array deque
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>(5);

        // Use add() method to add elements in the deque
        deque.addFirst(100);
        deque.addFirst(200);
        deque.addFirst(150);
        deque.addFirst(95);

        // Print all the elements of the original deque
        System.out.println("Elements of the original deque:");
        for (Integer number : deque) {
            System.out.println("Number = " + number);
        }

        // Using remove() remove element at the first(head) postion
        int re = deque.remove();
        System.out.println("Element removed is: " + re);


        // Print all the elements available in deque after pushing two elements using remove()
        System.out.println("New deque:");
        for (Integer number : deque) {
            System.out.println("Number = " + number);
        }
        TreeSet ts = new TreeSet();
        SortedSet ss = new TreeSet();
        LinkedHashSet lhs = new LinkedHashSet();
    }
}

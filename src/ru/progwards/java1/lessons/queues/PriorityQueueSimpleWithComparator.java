package ru.progwards.java1.lessons.queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueSimpleWithComparator {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        PriorityQueue<Integer> priQueue = new PriorityQueue<>(comparator);
        priQueue.offer(144);
        priQueue.offer(21);
        priQueue.offer(377);
        priQueue.offer(89);
        priQueue.offer(34);
        priQueue.offer(233);
        priQueue.offer(55);

        while (!priQueue.isEmpty()) {
            System.out.println(priQueue.poll());
        }

    }
}

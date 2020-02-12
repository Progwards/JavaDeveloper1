package ru.progwards.java1.lessons.queues;

import org.jetbrains.annotations.NotNull;

import java.util.PriorityQueue;

public class PriorityQueueLex {
    static class PriorityString implements Comparable<PriorityString> {
        private String str;
        private int priority;

        public PriorityString(String str, int priority) {
            this.str = str;
            this.priority = priority;
        }

        @Override
        public int compareTo(@NotNull PriorityString o) {
            return Integer.compare(priority, o.priority);
        }

        @Override
        public String toString() {
            return priority + " " + str;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<PriorityString> priQueue = new PriorityQueue<>();
        priQueue.offer(new PriorityString("Знание", 1));
        priQueue.offer(new PriorityString("да", 1));
        priQueue.offer(new PriorityString("наука", 3));
        priQueue.offer(new PriorityString("на", 3));
        priQueue.offer(new PriorityString("вороту", 3));
        priQueue.offer(new PriorityString("не", 5));
        priQueue.offer(new PriorityString("висят", 5));

        while (!priQueue.isEmpty()) {
            System.out.println(priQueue.poll());
        }
    }
}

package ru.progwards.java1.lessons.map;

import java.util.Hashtable;

public class HashtableVsNull {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        try {
            hashtable.put(null, "Значение");
        } catch(Throwable t) {
            System.out.println(t);
        }

        try {
            hashtable.put(1, null);
        } catch(Throwable t) {
            System.out.println(t);
        }
    }
}

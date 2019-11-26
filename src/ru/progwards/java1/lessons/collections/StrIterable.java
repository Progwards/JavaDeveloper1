package ru.progwards.java1.lessons.collections;

import java.util.*;
// This class supports iteration of the
// characters that comprise a String.
class StrIterable implements Iterable<Character>, Iterator<Character> {
    private String str;
    private int count = 0;

    StrIterable(String s) {
        str = s;
    }

    // The next three methods impement Iterator.
    public boolean hasNext() {
        return count < str.length();
    }

    public Character next() {
        if(count == str.length())
            throw new NoSuchElementException();

        return str.charAt(count++);
    }

    public void remove () {
        throw new UnsupportedOperationException();
    }

    // This method implements Iterable.
    public Iterator iterator() {
        return this;
    }
}

class ForEachIterable {
    public static void main(String args[]) {
        StrIterable x = new StrIterable("This is a test.");

        // Show each character.
        for(char ch : x)
            System.out.print(ch);

        System.out.println();

        List list = new ArrayList<Integer>();
    }
}
package ru.progwards.java1.lessons.exceptions;

import java.io.IOException;

public class SuppressedTryWithResources {
    public static void doAlwaysExceptions() throws IOException {
        try(AlwaysExceptions ae = new AlwaysExceptions(1)) {
            ae.method();
        }
    }

    public static void main(String[] args) {
        try {
            doAlwaysExceptions();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            for (Throwable t: e.getSuppressed())
                System.out.println(t.getMessage() + " (подавленное)");
        }
    }
}

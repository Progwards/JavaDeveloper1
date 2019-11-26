package ru.progwards.java1.lessons.exceptions;

import java.io.IOException;

public class AlwaysExceptions implements AutoCloseable {
    int id = 0;

    public AlwaysExceptions(int id) throws IOException {
        this.id = id;
    }

    public void method() throws IOException {
        throw new IOException(this + ": исключение в method");
    }

    @Override
    public void close() throws IOException {
        throw new IOException(this + ": исключение в close");
    }

    @Override
    public String toString() {
        return "AlwaysExceptions(" + id + ")";
    }
}

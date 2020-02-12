package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPathsNormalizePath {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");

        System.out.println("path: " + path);

        Path absPath = path.toAbsolutePath();
        System.out.println("absPath: " + absPath);

        Path normPath = absPath.normalize();
        System.out.println("normPath: " + normPath);
    }
}

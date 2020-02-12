package ru.progwards.java1.lessons.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPathsResolvePath {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Projects/Academy/Java1");

        Path path1 = path.resolve("src");
        Path path2 = path.resolve("/Projects/Academy");
        Path path3 = path.resolve("..");

        System.out.println("path: " + path + "\n");

        System.out.println("path1: " + path1);
        System.out.println("path2: " + path2);
        System.out.println("path3: " + path3);
    }
}

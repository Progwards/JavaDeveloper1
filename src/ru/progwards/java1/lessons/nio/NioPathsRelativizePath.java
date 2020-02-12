package ru.progwards.java1.lessons.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPathsRelativizePath {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:/Projects/Academy/Java1");
        Path path2 = Paths.get("C:/Projects");

        Path relPath1_1 = path1.relativize(path1);
        Path relPath1_2 = path1.relativize(path2);
        Path relPath2_1 = path2.relativize(path1);

        System.out.println("path1: " + path1);
        System.out.println("path2: " + path2 + "\n");

        System.out.println("relPath1_1: " + relPath1_1);
        System.out.println("relPath1_2: " + relPath1_2);
        System.out.println("relPath2_1: " + relPath2_1);
    }
}

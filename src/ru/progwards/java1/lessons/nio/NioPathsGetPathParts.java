package ru.progwards.java1.lessons.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPathsGetPathParts {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:/Projects/Academy/Java1");

        System.out.println("path1: " + path1);
        System.out.println("getFileName(): " + path1.getFileName());
        System.out.println("getNameCount: " + path1.getNameCount());
        System.out.println("getName(0): " + path1.getName(0));
        System.out.println("getName(1): " + path1.getName(1));
        System.out.println("getName(2): " + path1.getName(2));
        System.out.println("subpath(0, 1): " + path1.subpath(0, 1));
        System.out.println("subpath(1, 3): " + path1.subpath(1, 3));
        System.out.println("getRoot: " + path1.getRoot());
        System.out.println("getParent: " + path1.getParent());
    }
}

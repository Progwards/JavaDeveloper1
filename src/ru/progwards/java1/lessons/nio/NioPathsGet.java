package ru.progwards.java1.lessons.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NioPathsGet {
    public static void main(String[] args) {
        Path path1 = Paths.get("C:/Projects/Academy/Java1");
        Path path2 = Paths.get("src");
        Path path3 = Paths.get("file1.txt");

        System.out.println("path1:");
        System.out.println(path1);
        System.out.println(path1.toAbsolutePath());

        System.out.println("\npath2:");
        System.out.println(path2);
        System.out.println(path2.toAbsolutePath());

        System.out.println("\npath3:");
        System.out.println(path3);
        System.out.println(path3.toAbsolutePath());
    }
}

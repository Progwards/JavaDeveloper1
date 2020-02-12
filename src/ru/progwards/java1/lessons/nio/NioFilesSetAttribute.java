package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesSetAttribute {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Projects/Academy/Java1/file1.txt");

        String attr = "dos:hidden";

        System.out.println(attr + ": " + Files.getAttribute(path, attr));
        Files.setAttribute(path, attr, true);
        System.out.println(attr + ": " + Files.getAttribute(path, attr));
        Files.setAttribute(path, attr, false);
        System.out.println(attr + ": " + Files.getAttribute(path, attr));
    }
}

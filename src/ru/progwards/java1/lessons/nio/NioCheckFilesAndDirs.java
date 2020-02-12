package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCheckFilesAndDirs {
    public static void main(String[] args) throws IOException {
        Path pathName = Paths.get("C:/Projects/Academy/Java1/file1.txt");

        System.out.println("exists:         " + Files.exists(pathName));
        System.out.println("notExists:      " + Files.notExists(pathName));
        System.out.println("isReadable:     " + Files.isReadable(pathName));
        System.out.println("isWritable:     " + Files.isWritable(pathName));
        System.out.println("isDirectory:    " + Files.isDirectory(pathName));
        System.out.println("isRegularFile:  " + Files.isRegularFile(pathName));
        System.out.println("isHidden:       " + Files.isHidden(pathName));
        System.out.println("isExecutable:   " + Files.isExecutable(pathName));
    }
}

package ru.progwards.java1.lessons.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFilesIsSameAndIsSym {
    public static void main(String[] args) throws IOException {
        Path pathName = Paths.get("C:/Projects/Academy/Java1/file1.txt");
        Path pathSym = Paths.get("symlinkJava1");
        Path pathName1 = Paths.get("./file1.txt");
        Path pathName2 = Paths.get("../Java1/file1.txt");
        Path pathName3 = Paths.get("../file1.txt"); // копия file1.txt в каталоге Academy

        System.out.println("isSymbolicLink pathName: " + Files.isSymbolicLink(pathName));
        System.out.println("isSymbolicLink pathSym:  " + Files.isSymbolicLink(pathSym));
        System.out.println("isSameFile pathName:     " + Files.isSameFile(pathName, pathName));
        System.out.println("isSameFile pathSym:      " + Files.isSameFile(pathName, pathSym.resolve("file1.txt")));
        System.out.println("isSameFile pathName1:    " + Files.isSameFile(pathName, pathName1));
        System.out.println("isSameFile pathName2:    " + Files.isSameFile(pathName, pathName2));
        System.out.println("isSameFile pathName3:    " + Files.isSameFile(pathName, pathName3));
    }
}

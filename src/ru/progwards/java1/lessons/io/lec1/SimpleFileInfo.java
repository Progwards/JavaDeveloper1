package ru.progwards.java1.lessons.io.lec1;

import java.io.File;
import java.util.Date;

public class SimpleFileInfo {
    public static void main(String[] args) {
        //File fileInfo = new File("C:\\Projects\\Academy\\Java1\\Java1.iml");
        File fileInfo = new File("C:/Projects/Academy/Java1/Java1.iml");
        System.out.println("exists: " + fileInfo.exists());
        System.out.println("canExecute: " + fileInfo.canExecute());
        System.out.println("lastModified: " + new Date(fileInfo.lastModified()));
        System.out.println("length: " + fileInfo.length());
        System.out.println("getParent: " + fileInfo.getParent());
        System.out.println("getPath: " + fileInfo.getPath());
        System.out.println("getName: " + fileInfo.getName());
        System.out.println("isDirectory: " + fileInfo.isDirectory());
        System.out.println("isFile: " + fileInfo.isFile());
        System.out.println("isHidden: " + fileInfo.isHidden());
    }
}

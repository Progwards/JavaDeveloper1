package ru.progwards.java1.lessons.io.presentation.lec1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write2ByteFileViaInt {
    public static void main(String[] args) {
        try {
            FileOutputStream byteFile = new FileOutputStream("file1.bin");
            try {
                for (int b = 0; b < 512; b++) {
                    byteFile.write(b);
                }
            } finally {
                byteFile.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
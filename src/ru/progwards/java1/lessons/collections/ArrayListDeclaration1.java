package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;

public class ArrayListDeclaration1 {
    public static void main(String args[]) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1); // автоупаковка
        arrayList.add(1.0); // автоупаковка
        arrayList.add(true); // автоупаковка
        arrayList.add(new Object());
        arrayList.add(new ArrayList());
    }
}

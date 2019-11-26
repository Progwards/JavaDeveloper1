package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdd {
    public static void main(String args[]) {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        arrayList.add(0, 5);

        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
}

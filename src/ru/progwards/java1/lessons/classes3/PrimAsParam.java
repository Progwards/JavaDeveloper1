package ru.progwards.java1.lessons.classes3;

public class PrimAsParam {
    static void primAsParam(int i) {
        i = 555;
        System.out.println("primAsParam i = " + i);
    }

    public static void main(String[] args) {
        int i = 999;
        int x = 555;
        int y = 999;
        boolean b = true;
        String str1 = "Строка1";
        String str2 = "Строка2";
        System.out.println("main before i = " + i);
        primAsParam(i);
        System.out.println("main after i = " + i);
    }
}

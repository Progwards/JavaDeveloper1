package ru.progwards.java1.lessons.io.lec3;

public class StringOperations {
    public static void main(String[] args) {
        //               012345678901234567
        String regNum = "    а123аК 177    ";

        System.out.println(regNum.toUpperCase());
        System.out.println(regNum.toLowerCase());
        System.out.println(regNum.replace(" ", ""));
        System.out.println(regNum.trim());
        System.out.println(regNum.indexOf("123"));
        System.out.println(regNum.substring(5));
        System.out.println(regNum.substring(5, 8));
    }
}

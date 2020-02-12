package ru.progwards.java1.lessons.lex;

import java.util.StringTokenizer;

public class StringTokenizerWithDelimetersOnly {
    public static void main(String[] args) {
        String txt = "      \t   \n .        \r ,\f     .  ";
        StringTokenizer tokenizer = new StringTokenizer(txt, " \t\n\r\f.,-");

        System.out.println("hasMoreTokens: " + tokenizer.hasMoreTokens());
    }
}

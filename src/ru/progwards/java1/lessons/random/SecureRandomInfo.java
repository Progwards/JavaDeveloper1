package ru.progwards.java1.lessons.random;

import java.security.SecureRandom;
import java.security.Security;

public class SecureRandomInfo {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        System.out.println("Алгоритм по умолчанию: " + secureRandom.getAlgorithm());
        System.out.println("Провайдер: " + secureRandom.getProvider());

        System.out.println(Security.getAlgorithms("SecureRandom"));
    }
}

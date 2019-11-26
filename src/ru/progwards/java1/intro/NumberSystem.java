package ru.progwards.java1.intro;

// Представление числа в произвольной системе счисления с базой от 2 до 16 включительно
class NumberSystem {
    // получение цифры в строковом представлении по числу от 0 до 15
    public static String val2Digit(int val) {
        if (val == 10) {
            return "A";
        } else if (val == 11) {
            return "B";
        } else if (val == 12) {
            return "C";
        } else if (val == 13) {
            return "D";
        } else if (val == 14) {
            return "E";
        } else if (val == 15) {
            return "F";
        }

        return Integer.toString(val);
    }

    // преобразование числа val к виду в системе счисления с основанием base
    public static String show(int val, int base) {
        String result = "";
        while (val > 0) {
            int remainder = val % base;
            result = val2Digit(remainder) + result;
            val /= base;
        }

        if (result.isEmpty() )
            return "0";
        return result;
    }

    public static void main(String[] args) {
        int value = 25;
        System.out.println("Десятичная система: " + value);
        System.out.println("Двоичная система: " + NumberSystem.show(value, 2));
        System.out.println("Шестнадцатеричная система: " + NumberSystem.show(value, 16));
    }
}

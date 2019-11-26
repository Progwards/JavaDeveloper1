package ru.progwards.java1.lessons.exceptions;

public class FewExceptionsInOne {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            System.out.println((new int[5])[5]);
            int e = 1 / 0;
            ((Object)null).toString();
        } catch(ArithmeticException e) {
            System.out.println("Произошло деление на 0");
        } catch(NullPointerException e) {
            System.out.println("Обращение к объекту по ссылке null");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException  e) {
            System.out.println("IndexOutOfBounds или NegativeArraySize");
        }
    }
}

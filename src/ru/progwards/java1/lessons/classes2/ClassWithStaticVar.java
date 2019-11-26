package ru.progwards.java1.lessons.classes2;

public class ClassWithStaticVar {
    static String staticString;

    public static void main(String[] args) {
        ClassWithStaticVar a = new ClassWithStaticVar();
        ClassWithStaticVar.staticString =
                "Переменная я статическая, и хранюсь в одном месте, фактически.";
        System.out.println(ClassWithStaticVar.staticString);

        ClassWithStaticVar b = new ClassWithStaticVar();
        ClassWithStaticVar.staticString =
                "В одном месте? Что ж - доверяем, но, для верности, проверяем.";
        System.out.println(ClassWithStaticVar.staticString);
    }
}

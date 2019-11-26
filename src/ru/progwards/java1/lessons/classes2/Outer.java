package ru.progwards.java1.lessons.classes2;

public class Outer {
    public int x = 1;

    class Inner {
        public int x = 5;

        void innerMethod(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("Outer.this.x = " + Outer.this.x);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.innerMethod(25);
    }
}

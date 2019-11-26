package ru.progwards.java1.lessons.classes2;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        class Obj {
            public int value = 0;

            public Obj(int value) {
                this.value = value;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Obj obj = (Obj) o;
                return value == obj.value;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        }

        HashSet<Obj> hsi = new HashSet<>();
        hsi.add(new Obj(1));
        hsi.add(new Obj(1));
        hsi.add(new Obj(1));
        hsi.add(new Obj(4));
        hsi.add(new Obj(5));

        new Integer(5).compareTo(5);
    }
}

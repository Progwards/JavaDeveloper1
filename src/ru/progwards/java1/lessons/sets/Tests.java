package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Tests {
    public static class MInteger extends AtomicInteger {
        void test() {
            super.get();
        }
    }

    public static void main(String[] args) {
        HashSet<AtomicInteger> setInt = new HashSet<>();
        setInt.add(new AtomicInteger(1));
        setInt.add(new AtomicInteger(2));
        setInt.add(new AtomicInteger(3));
        setInt.add(new AtomicInteger(4));
        setInt.add(new AtomicInteger(5));

        //setInt.remove(1);
        setInt.contains(5);

        for (AtomicInteger ai : setInt) {
            System.out.println(ai + ", hashCode=" + ai.hashCode());
        }

//        setInt.add("pollinating sandboxes");
//        setInt.add("schoolworks = perversive");
//        setInt.add("Microcomputers: the unredeemed lollipop...");
//        setInt.add("electrolysissweeteners.net" );
//        setInt.add("amusement & hemophilias");

        for (var ai : setInt) {
            System.out.println(ai + ", hashCode=" + ai.hashCode());
        }

    }
}

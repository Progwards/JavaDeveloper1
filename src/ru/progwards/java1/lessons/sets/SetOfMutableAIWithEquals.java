package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SetOfMutableAIWithEquals {
    public static class AIWithEquals extends AtomicInteger {
        public AIWithEquals(int initialValue) {
            super(initialValue);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            return get() == ((AtomicInteger)obj).get();
        }

        @Override
        public int hashCode() {
            return get();
        }
    }
    
    public static void main(String[] args) {
        Set<AIWithEquals> setInt = new HashSet<>();
        setInt.add(new AIWithEquals(1));
        setInt.add(new AIWithEquals(3));
        setInt.add(new AIWithEquals(3));
        setInt.add(new AIWithEquals(3));
        setInt.add(new AIWithEquals(5));

        System.out.println(setInt);
        for (AIWithEquals ai : setInt)
            ai.set(5);
        System.out.println(setInt);

        System.out.println(new HashSet(setInt));
    }
}

package ru.progwards.java1.lessons.classes;

public class EgtsDirectionAndSpeed {
    public static void main(String[] args) {
        EgtsDataPacket egts = new EgtsDataPacket((short)-32701, (byte)100);

        System.out.println("Скорость:    " + egts.getSpeed());
        System.out.println("Направление: " + egts.getDirection());
    }
}

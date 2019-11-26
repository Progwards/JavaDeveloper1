package ru.progwards.java1.lessons.egts;

public class EgtsDirectionAndSpeed {
    // скорость
    public static int getSpeed(short speedAndDir) {
        int speed = speedAndDir & 0b01111111_11111111;

        return speed;
    }

    // направление
    public static int getDirection(byte dirLow, short speedAndDir) {
        int direction = speedAndDir & 0b10000000_00000000;
        direction = direction >> 7;
        direction += dirLow & 0b11111111;

        return direction;
    }

    public static void main(String[] args) {
        short speedAndDir = -32701;
        byte dir = 100;
        System.out.println("Скорость:    " + getSpeed(speedAndDir));
        System.out.println("Направление: " + getDirection(dir, speedAndDir));
    }
}

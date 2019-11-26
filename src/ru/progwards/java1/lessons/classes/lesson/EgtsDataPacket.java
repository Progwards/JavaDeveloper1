package ru.progwards.java1.lessons.classes.lesson;

class EgtsDataPacket {
    // свойства
    private short speedAndDir;
    private byte dirLow;

    // методы...
    EgtsDataPacket(short speedAndDir, byte dirLow) {
        this.speedAndDir = speedAndDir;
        this.dirLow = dirLow;
    }

    // скорость
    int getSpeed() {
        return speedAndDir & 0b01111111_11111111;
    }

    // направление
    int getDirection() {
        int direction = speedAndDir & 0b10000000_00000000;
        direction = direction >> 7;
        direction += dirLow & 0b11111111;

        return direction;
    }
}

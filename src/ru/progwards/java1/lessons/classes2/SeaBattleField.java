package ru.progwards.java1.lessons.classes2;

public class SeaBattleField {
    public int sizeX = 10;
    public int sizeY = 10;
    private byte[][] field = new byte[sizeX][sizeY];

    public class Ship {
        public int x, y; // координаты левой верхней палубы корабля
        private boolean isVertical;
        int length;

        Ship(int length) {
            this.length = length;
        }

        void generateShip() {
            for (int i = 0; i < sizeY; i++) {
                for (int j = 0; j < sizeX; j++) {
                    if (field[i][j] == 1) {
                        // какой-то код...
                    }
                }
            }
        }

        public void showFieldInfo() {
            System.out.println("Размер поля: " + sizeX + "x" + sizeY);
        }
    }

    public static void main(String[] args) {
        SeaBattleField seaField = new SeaBattleField();
        SeaBattleField.Ship ship = seaField.new Ship(3);
        seaField = null;
        ship.showFieldInfo();
    }
}


package Kode;

public class Dragonmain07 {
    public static void main(String[] args) {
        Dragon07 dragon = new Dragon07(0, 0, 10, 10);
        dragon.moveLeft();
        dragon.moveRight();
        dragon.moveUp();
        dragon.moveDown();
        dragon.printposition();
    }
}
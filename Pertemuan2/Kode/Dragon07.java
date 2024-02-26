package Kode;
public class Dragon07 {
    int x;
    int y;
    int width;
    int height;

    public Dragon07(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x - 1 >= 0) {
            x--;
            printposition();
        } else {
            detectCollision(x,y);
        }
    }

    void moveRight() {
        if (x + 1 < width) {
            x++;
            printposition();
        } else {
            detectCollision(x,y);
        }
    }

    void moveUp() {
        if (y - 1 >= 0) {
            y--;
            printposition();
        } else {
            detectCollision(x,y);
        }
    }

    void moveDown() {
        if (y + 1 < height) {
            y++;
            printposition();
        } else {
            detectCollision(x,y);
        }
    }

    void printposition() {
            System.out.println("Posisi Dragon : (" + x + ", " + y + ")");
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }
    
}
package 2_jobsheet2;

class jobsheet2 {
    int x, y, width, height;
    void moveLeft(int a) {
        x -= 1;
    }
    void moveRight(int a) {
        x += 1;
    }
    void moveUp(int a) {
        y += 1;
    }
    void moveDown(int a) {
        y -= 1;
    }
    void printPosition(int a, int b) {
        System.out.println("\nPacman pada posisi (x,y) = " + x + "," + y);
    }
}
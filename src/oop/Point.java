package oop;

//        X va Y koordinatalarni ifodalovchi atributlari bor bo’lgan Point classini yozing.
//        Koordinatalarni “(45, 56)” shaklda chop etuvchi printXY() methodini yozing.
public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x) {
        this.x = x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

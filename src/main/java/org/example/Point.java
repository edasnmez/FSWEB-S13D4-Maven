package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setter

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    //overload
    //(0,0) noktasına uzaklık
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    //verilen noktaya göre uzaklık
    public double distance(int a, int b) {
        return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
    }
    // Başka bir Point objesine uzaklık
    public double distance(Point p) {
        return Math.sqrt((p.getX() - x) * (p.getX() - x) + (p.getY() - y) * (p.getY() - y));
    }
}

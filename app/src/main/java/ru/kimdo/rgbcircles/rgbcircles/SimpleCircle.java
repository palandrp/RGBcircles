package ru.kimdo.rgbcircles.rgbcircles;

/**
 * Created by kimdo on 25.04.17.
 */
public class SimpleCircle {

    protected int x;
    protected int y;
    protected int radius;

    public SimpleCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}

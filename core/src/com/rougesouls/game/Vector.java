package com.rougesouls.game;

public class Vector {
    double x, y;
    double normalizedX, normalizedY;

    public Vector(double xIn, double yIn) {
        x = xIn;
        y = yIn;
        if (Math.abs(x) + Math.abs(y) > 1) {
            double m = Math.sqrt((x * x) + (y * y));
            normalizedX = x / m;
            normalizedY = y / m;
        }
        else {
            normalizedY = y;
            normalizedX = x;
        }

    }

    public double getNormalizedX() {
        System.out.println(normalizedX);
        return normalizedX;
    }

    public double getNormalizedY() {
        System.out.println(normalizedX);
        return normalizedY;
    }
}

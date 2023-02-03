package com.csc205.project1;

import static org.junit.jupiter.api.Assertions.*;
class PointTest {

    @org.junit.jupiter.api.Test
    void distance() {

        double expected = 5;
        Point a = new Point(3.0,1.0);
        Point b = new Point(6.0, 5.0);
        double actual = a.distance(b);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shiftX() {
        double expected = 8.0;
        Point a = new Point(3.0,1.0);
        a.shiftX(5.0);
        double actual = a.getX();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shiftY() {
        double expected = 6.0;
        Point a = new Point(3.0,1.0);
        a.shiftY(5.0);
        double actual = a.getY();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void rotate() {
        double rotation = Math.PI / 2.0;
        double expected1 = (3.0 * Math.cos(rotation) - 1.0 * Math.sin(rotation));
        double expected2 = 3.0;
        Point a = new Point(3.0,1.0);
        a.rotate(rotation);
        double actual1 = a.getX();
        double actual2 = a.getY();
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }
}
package com.csc205.project1;

import static java.lang.Math.sqrt;

public class Point {
    private double x,y;

    public Point() {
    x = 0.0;
    y = 0.0;
    }

    public Point(double xaxis, double yaxis){

        x = xaxis;
        y = yaxis;
    }

    public double distance(Point p2){

        double x1,y1;
        x1 = p2.getX() - x;
        y1 = p2.getY() - y;
        return Math.sqrt(x1 * x1 + y1 * y1);
    }

    public double getX(){
        return x;
    }

    public void setX(double xaxis){

        x = xaxis;
    }

    public double getY(){
        return y;
    }

    public void setY(double yaxis){

        y = yaxis;
    }

    public void setPoint(double xaxis, double yaxis){

        x = xaxis;
        y = yaxis;
    }

    public void shiftX(double xaxis){

    x = x + xaxis;
    }

    public void shiftY(double yaxis){

    y = y + yaxis;
    }

    public void rotate(double angle){

        double x1;
        x1 = x;
        x = x1 * Math.cos(angle) - y * Math.sin(angle);
        y = x1 * Math.sin(angle) + y * Math.cos(angle);
    }

    public String toString(){

        return "Point{x=" + x + ", y=" + y + "}";
    }
}

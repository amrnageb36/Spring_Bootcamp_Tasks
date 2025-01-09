package com.example;

public class Rectangle implements Shape {

    private double w;
    private double h;

    public void setH(double h) {
        this.h = h;
    }
    public void setW(double w) {
        this.w = w;
    }

    @Override
    public double getArea() {
        return w * h;
    }
}

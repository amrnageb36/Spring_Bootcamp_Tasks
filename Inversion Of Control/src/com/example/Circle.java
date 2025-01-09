package com.example;

public class Circle implements Shape {

    private double r;

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea(){
        return Math.PI*r*r;
    }
}

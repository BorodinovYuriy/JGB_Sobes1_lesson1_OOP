package ru.bor.lesson1.q3;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius; }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

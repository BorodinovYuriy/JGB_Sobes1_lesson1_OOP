package ru.bor.lesson1.q3;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    //Реализация полиморфизма
    public Triangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }

    public Triangle(double hypotenuse, double cathet) {
        this.sideA = hypotenuse;
        this.sideB = cathet;
        this.sideC = cathet;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

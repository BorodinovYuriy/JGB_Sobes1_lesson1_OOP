package ru.bor.lesson1.q3;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

//Реализация полиморфизма
    public Rectangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
       return sideA * sideB;
    }
}

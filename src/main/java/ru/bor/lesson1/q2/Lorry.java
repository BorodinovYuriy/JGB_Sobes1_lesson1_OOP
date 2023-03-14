package ru.bor.lesson1.q2;

public class Lorry extends Car implements Moveable, Stopable{

    @Override
    public void move(){
        System.out.println("Car is moving");
    }

    @Override
    public void stop(){
        System.out.println("Car is stop");
    }

    @Override
    void open() {

    }
}


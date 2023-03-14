package ru.bor.lesson1.q3;

public class MainTest {
    public static void main(String[] args) {

        //Пример полиморфизма
        Rectangle rect1 = new Rectangle(10);
        Rectangle rect2 = new Rectangle(10,20);

        System.out.println(rect1.area());
        System.out.println(rect2.area());

    }
}

package com.Task8;

/**
 * Опишите паттерн декоратор, его отличие от адаптера, приведите пример реализации
 *
 * Паттерн «Декоратор» позволяет добавлять новую функциональность объекту, является некоторой оберткой над классом.
 * Не управляет жизненным циклом объекта.
 * */

public class Test {
    public static void main(String[] args) {
        Car car1 = new AudiA3();
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice());

        car1 = new GPS(car1);
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice());

        car1 = new AirCondition(car1);
        System.out.println(car1.getInfo());
        System.out.println(car1.getPrice());

        Car car2 = new AirCondition(new GPS(new AudiA4()));
        System.out.println(car2.getInfo());
        System.out.println(car2.getPrice());
    }
}

package com.Task1;

/**
 * Опишите паттерн синглтон, приведите пример реализации
 *
 * Он позволяет гарантировать, что будет существовать ровно один объект существующего класса.
 * */

public class Singleton2 { //нет ленивой инициализации
    private static Singleton2 instance = new Singleton2();
    private Singleton2(){}

    public static Singleton2 getInstance() {
        return instance;
    }
}

class Test2{
    public static void main(String[] args) {
        //Singleton1 s1 = new Singleton1();
        Singleton2 s2 = Singleton2.getInstance();
        Singleton2 s3 = Singleton2.getInstance();
        System.out.println(s2);
        System.out.println(s3);
    }
}
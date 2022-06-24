package com.Task20;

/**
 * 20. Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
 * Переделать класс использующий Printable используя ссылку на статический метод
 * */

public class PrintableDemo{
    static Printable printable = () -> System.out.println("Hello");
}

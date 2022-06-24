package com.Task2;

/**
 * Опишите паттерн фабрика, приведите пример реализации
 *
 * Паттерн «Фабричный метод» – определяет интерфейс создания объектов, позволяя подклассам менять тип
 * создаваемых объектов
 * */

public class Food {
    public static void main(String[] args) {
        CookFactory cookFactory = new PastaCookFactory();
        Cook cook = cookFactory.createCook();
        cook.prepareFood();
    }
}

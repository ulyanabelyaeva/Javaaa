package com.Task6;

/**
 * Опишите паттерн абстрактная фабрика, приведите пример реализации
 *
 * Паттерн «Абстрактная фабрика» – позволяет создавать семейства определенных объектов.
 * Фактически является расширением паттерна «Фабричный метод».
 * */

public class TestFood {
    public static void main(String[] args) {
        FoodFactory foodFactory = new RuFoodFactory();
        Pasta pasta = foodFactory.getPasta();
        pasta.preparePasta();
    }
}

package com.Task17;

import java.util.function.Consumer;

/**
 * Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль
 * сообщение “Отгрузили ящик с весом n”. “Отправляем ящик с весом n” Используем функциональный интерфейс
 * Consumer и метод по умолчанию andThen.
 * */

public class HeavyBoxDemo{
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer1 = heavyBox -> System.out.println("Отгрузили ящик с весом " + heavyBox.getWeight());
        Consumer<HeavyBox> consumer2 = heavyBox -> System.out.println("Отправляем ящик с весом " + heavyBox.getWeight());

        consumer1.andThen(consumer2).accept(new HeavyBox(32));
    }
}

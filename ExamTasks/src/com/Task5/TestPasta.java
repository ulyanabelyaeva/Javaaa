package com.Task5;

/**
 * Опишите паттерн строитель, приведите пример реализации
 *
 * Паттерн «Строитель» – разделяет создание объекта на отдельные шаги, а также позволяет использовать один и тот же
 * код создания для получения различных представлений.
 * */

public class TestPasta {
    public static void main(String[] args) {
        Pasta pasta = new PastaBuilder()
                .buildName("Карбонара")
                .buildSize(Size.Middle)
                .build();
        System.out.println(pasta);
    }
}

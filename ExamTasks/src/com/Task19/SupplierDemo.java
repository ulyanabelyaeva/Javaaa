package com.Task19;

import java.util.function.Supplier;

/**
 * 19. Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
 * Используем функциональный интерфейс Supplier.
 * */

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        System.out.println(supplier.get());
    }
}

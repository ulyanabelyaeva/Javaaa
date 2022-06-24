package com.Task14;

import java.util.function.Predicate;

/**
 * Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.
 * */

public class PredicataDemo2 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> !s.isEmpty();

        System.out.println(predicate1.test(""));
        System.out.println(predicate1.test("text"));
    }
}

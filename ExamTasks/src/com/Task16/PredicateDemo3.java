package com.Task16;

import java.util.function.Predicate;

/**
 * Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
 * Используем функциональный интерфейс Predicate.
 * */

public class PredicateDemo3 {
    public static void main(String[] args) {
        Predicate<String> predicate1 = s -> s.startsWith("J");
        Predicate<String> predicate2 = s -> s.startsWith("N");
        Predicate<String> predicate3 = s -> s.endsWith("A");

        Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);

        System.out.println(predicate.test("JddA"));
        System.out.println(predicate.test("NkkA"));
        System.out.println(predicate.test("Jdda"));
    }

}

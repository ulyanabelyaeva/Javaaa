package com.Task13;

/**
 * Создать лямбда выражение, которое возвращает значение true, если строка не null,
 * используя функциональный интерфейс Predicate.
 * */

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate <String> predicate = str -> str!=null;
        System.out.println(predicate.test(null));
    }
}

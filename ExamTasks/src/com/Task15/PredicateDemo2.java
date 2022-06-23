package com.Task15;

/**
 * Написать программу проверяющую, что строка не null и не пуста, используя метод and()
 * функционального интерфейса Predicate.
 * */

import java.util.function.Predicate;

public class PredicateDemo2{

    public static void main(String[] args) {
        Predicate<String> predicate = str -> str!=null;
        Predicate<String> predicate2 = str -> !str.equals("");

        System.out.println(predicate.and(predicate2).test("ll"));
    }
}

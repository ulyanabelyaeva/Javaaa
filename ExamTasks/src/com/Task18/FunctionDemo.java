package com.Task18;

import java.util.function.Function;

/**
 * Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
 * “Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
 * */

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function = n -> {
            String result = "Ноль";
            if (n < 0) {
                result = "Отрицательное число";
            } else if (n > 0) {
                result = "Положительное число";
            }
            return result;
        };
        System.out.println(function.apply(0));
        System.out.println(function.apply(-1));
        System.out.println(function.apply(1));
    }
}

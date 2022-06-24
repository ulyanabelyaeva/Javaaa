package com.Task3;

/**
 * Опишите паттерн стратегия, приведите пример реализации
 *
 * Паттерн «Стратегия» позволяет определить семейство различных алгоритмов, которые можно заменять
 * */

public class Test {
    public static void main(String[] args) {

        Auto sedan = new Sedan();
        Auto hybrid = new HybridAuto();
        Auto f1car = new F1Car();

        sedan.fill();
        hybrid.fill();
        f1car.fill();
    }
}

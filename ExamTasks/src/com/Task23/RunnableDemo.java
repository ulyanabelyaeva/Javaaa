package com.Task23;

/**
 * 23. Создать класс реализующий Runnable
 * a. Создать класс, реализующий интерфейс Runnable.
 * b. Переопределить run() метод. Создать цикл for. В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка.
 * c. Используем статический метод Thread.sleep(), чтобы сделать паузу.
 * d. Создать три потока, выполняющих задачу распечатки значений.
 * */

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        RunnableDemo r1 = new RunnableDemo();
        RunnableDemo r2 = new RunnableDemo();
        RunnableDemo r3 = new RunnableDemo();

        r1.run();
        r2.run();
        r3.run();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

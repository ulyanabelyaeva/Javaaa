package com.Task24;

/**
 * 24. Вывод символа в трех потоках
 * Необходимо создать три потока, которые изменяют один и тот же объект.
 * Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
 *
 * a. Создать класс расширяющий Thread.
 * b. Переопределить метод run() - здесь будет находиться синхронизированный блок кода.
 * c. Для того чтобы три объекта потока имели доступ к одному объекту,
 * создаем конструктор принимающий на вход StringBuilder объект.
 * d. Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта 3.
 * e. Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1.
 * f. В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
 * g. Затем создайте три экземпляра объекта нашего класса и запустите потоки.
 * */

public class ThreadDemo{

    public static void main(String[] args) throws InterruptedException {

        StringBuilder stringBuilder = new StringBuilder("a");

        MyThread tread1 = new MyThread(stringBuilder);
        MyThread tread2 = new MyThread(stringBuilder);
        MyThread tread3 = new MyThread(stringBuilder);

        tread1.start();
        tread2.start();
        tread3.start();

    }

}

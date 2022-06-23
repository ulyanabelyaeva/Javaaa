package com.Task12;

/**
 * Написать лямбда выражение для интерфейса Printable, который содержит один метод void print().
 * */
public class Print {

    public static void main(String[] args) {

        Printable printable;
        printable = (x, y) -> {
            for (int i = 0; i < 30; i++) {
                System.out.print(x + " ");
            }
            System.out.println();
            for (int i = 0; i < 30; i++) {
                System.out.print(" " + y);
            }
        };

        printable.print("t", "l");
    }
}

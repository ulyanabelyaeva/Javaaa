package com.Task22;

/**
 * 22.  Создать класс расширяющий Thread
 * a. Создать класс NewThread расширяющий Thread.
 * b. Переопределить метод run(). В цикле for вывести на консоль символ 100 раз.
 * c. Создать экземпляр класса и запустить новый поток.
 * */

public class NewThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.print("f");
        }
    }

    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }
}

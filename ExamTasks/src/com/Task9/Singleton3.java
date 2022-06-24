package com.Task9;

/**
 * Опишите  класс синглтон с отложенной инициализацией. Используйте synchronized
 * */

public class Singleton3 {
    static int count = 0;
    private static Singleton3 instance;
    private Singleton3(){count++;}
    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null)
                    instance = new Singleton3();
            }
        }
        return instance;
    }
}

class Runn implements Runnable{

    @Override
    public void run() {
        Singleton3.getInstance();
    }
}

class Test3{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runn()).start();
        }
        System.out.println("Количество объектов: " + Singleton3.count);
    }
}

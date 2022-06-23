package com.Task10;

/**
 * Опишите пример совместной работы двух процессов «производитель-потребитель».
 * Для реализации нужно создать два класса Producer  и Consumer.
 * Рекомендуется использовать BlockingQueue — расширенный интерфейс обычной очереди
 * */

import java.util.concurrent.SynchronousQueue;
/** * Java Program to solve Producer Consumer problem using SynchronousQueue. A
 * call to put() will block until there is a corresponding thread to take() that
 * element.
 */
//выровнять отступы ctrl+alt+i

//SynchronousQueue - это особый вид очереди - производитель ждет, пока потребитель не будет готов,
// потребитель ждет, пока производитель не будет готов
public class SynchronousQueueDemo {
    public static void main(String args[]) {
        final SynchronousQueue queue = new SynchronousQueue();
        Thread producer = new Thread("PRODUCER")
        {
            public void run() {
                String event = "RUUN";
                try
                {
                    queue.put(event); // thread will block here
                    System.out.println(Thread .currentThread().getName() + " published event : " + event);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        producer.start();

        Thread consumer = new Thread("CONSUMER") {
            public void run() {
                try
                {
                    String event = queue.take().toString(); // thread will block here
                        System.out.println(Thread .currentThread().getName() + " consumed event : " + event);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        consumer.start(); // starting consumer thread

    }
}


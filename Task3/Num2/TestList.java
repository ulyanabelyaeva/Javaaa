package Task3.Num2;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) throws InterruptedException {
        List<String> List1 = new ArrayList<>();
        TheadsafeList list = new TheadsafeList(List1);
        List<String> List2 = new ArrayList<>();

        /*MyThread thread1 = new MyThread(list);
        MyThread thread2 = new MyThread(list);

        thread1.start();
        thread2.start();

        System.out.println(" ");
        System.out.println(list.list);*/

        Thread one = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                try {
                    list.add("q");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread two = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                List2.add("u");
            }
        });
        one.start();
        two.start();

        System.out.println(list.size());
        System.out.println(List2.size());

    }
}

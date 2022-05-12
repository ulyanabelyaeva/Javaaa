package Task3.Num2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class TheadsafeList implements TheadsafeListInterface{
    List<String> list;
    Semaphore semaphore = new Semaphore(1);
    public TheadsafeList(List<String> list) {
        this.list = list;
    }
    @Override
    public void add(String value) throws InterruptedException {
        semaphore.acquire();
        list.add(value);
        semaphore.release();
    }
    @Override
    public void add(int index, String value) throws InterruptedException {
        semaphore.acquire();
        list.add(index, value);
        semaphore.release();
    }
    @Override
    public void clear() throws InterruptedException {
        semaphore.acquire();
        list.clear();
        semaphore.release();
    }
    @Override
    public String get(int index) throws InterruptedException {
        semaphore.acquire();
        String value = list.get(index);
        semaphore.release();
        return value;
    }
    @Override
    public int size() throws InterruptedException {
        semaphore.acquire();
        int k = list.size();
        semaphore.release();
        return k;
    }
    @Override
    public String remove(int index) throws InterruptedException {
        semaphore.acquire();
        String value = list.remove(index);
        semaphore.release();
        return value;
    }
}

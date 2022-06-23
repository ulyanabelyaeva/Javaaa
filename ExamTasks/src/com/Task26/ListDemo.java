package com.Task26;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Существует некий ArrayList<String>, напишите реализацию удаления каждого 5-го элемента.
 * Используйте потоки API stream
 * */
public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1"); list.add("2"); list.add("3"); list.add("4"); list.add("5"); list.add("6"); list.add("7");
        list.add("8"); list.add("9"); list.add("10"); list.add("11");

        Stream<String> stream = list.stream();
        stream.forEach(p -> {
            if((list.indexOf(p)+1)%5 != 0)
                System.out.println(p);});

    }
}

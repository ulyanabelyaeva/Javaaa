package com.Task11.Way2;

import com.Task11.Function;

/**
 * Напишите реализацию  подсчета символов во всех строках переданных программе строках
 * (передать параметры можно с помощью настроек в IntelliJIdea ->Run Configuration)
 * */

public class Counter2{

    public int count(String[] args) {
        int result = 0;

        try{

            for (String arg : args) {
                result = result + arg.length();
            }

        } catch (Exception e){
            System.out.println("Need to get arguments");
        }

        return result;
    }

    public static void main(String[] args) {

        Function2 function;
        function = () -> {
            int result = 0;
            for (String arg : args) {
                result = result + arg.length();
            }
            System.out.println("Count of symbols: " + result);
            return result;
        };

        function.count();
    }
}

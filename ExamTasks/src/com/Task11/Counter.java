package com.Task11;
/**
 * Напишите реализацию  подсчета символов во всех строках переданных программе строках
 * (передать параметры можно с помощью настроек в IntelliJIdea ->Run Configuration)
 * */

public class Counter implements Function{

    @Override
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
        System.out.println("Count of symbols: " + new Counter().count(args));
    }
}

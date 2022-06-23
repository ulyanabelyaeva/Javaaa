package com.Task24;

public class MyThread extends Thread{

    private StringBuilder stringBuilder;

    public MyThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print(stringBuilder);
        }

        char c = stringBuilder.charAt(0);
        int code = (int)c;
        code = code + 1;
        char c2 = (char)code;
        String str = String.valueOf(c2);
        stringBuilder.replace(0, 1, str);
    }

}

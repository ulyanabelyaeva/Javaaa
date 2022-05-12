package Task3.Num2;

import Task3.ThreadsafeMap;

public class MyThread extends Thread{
    private TheadsafeList theadsafeList;
    public MyThread(TheadsafeList theadsafeList){
        this.theadsafeList = theadsafeList;
    }
    @Override
    public void run() {
        try {
            theadsafeList.add("first");
            theadsafeList.add("second");
            theadsafeList.add("third");
            theadsafeList.add("fourth");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package Task3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        ThreadsafeMap threadsafeMap = new ThreadsafeMap();
        Map <Integer, String> Map2 = new HashMap<>();

        Thread one = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                threadsafeMap.put(i, "i");
                Map2.put(i, "i");
            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                threadsafeMap.put(i, "i");
                Map2.put(i, "i");
            }
        });
        one.start();
        two.start();

        System.out.println(threadsafeMap.size());
        System.out.println(Map2.size());

        threadsafeMap.printMap();
    }
}
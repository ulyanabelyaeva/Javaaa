package Task3.Num2;

public interface TheadsafeListInterface {
    void add(String value) throws InterruptedException;
    void add(int index, String value) throws InterruptedException;
    void clear() throws InterruptedException;
    String get(int index) throws InterruptedException;
    int size() throws InterruptedException;
    String remove(int index) throws InterruptedException;
}

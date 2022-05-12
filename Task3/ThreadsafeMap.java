package Task3;

import java.util.*;

public class ThreadsafeMap implements Map{
    Map<Object, Object> map;
    public ThreadsafeMap() {
        this.map = new HashMap<>();
    }
    synchronized public void printMap() {
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Object key   = iterator.next();
            Object value = map.get(key);
            System.out.print(key + " ");
            System.out.println(value);
        }
    }
    @Override
    synchronized public int size() {
        return map.size();
    }
    @Override
    synchronized public Object put(Object key, Object value) {
        map.put(key, value);
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    @Override
    public boolean containsKey(Object key) {
        return false;
    }
    @Override
    public boolean containsValue(Object value) {
        return false;
    }
    @Override
    public Object get(Object key) {
        return null;
    }
    @Override
    public Object remove(Object key) {
        return null;
    }
    @Override
    public void putAll(Map m) { }
    @Override
    public void clear() { }
    @Override
    public Set keySet() {
        return null;
    }
    @Override
    public Collection values() {
        return null;
    }
    @Override
    public Set<Entry> entrySet() {
        return null;
    }
/*    @Override
    synchronized public String get(String value) {
        return map.get(value);
    }
    @Override
    synchronized public boolean containsKey(Integer key) {
        return map.containsKey(key);
    }
    @Override
    synchronized public boolean containsValue(String value) {
        return map.containsValue(value);
    }
    @Override
    synchronized public void remove(Integer key) {
        map.remove(key);
    }
    @Override
    synchronized public void replace(Integer key, String value) {
        map.replace(key, value);
    }*/
}


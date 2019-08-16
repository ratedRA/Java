package com.mymap;

public class MyMap<K, V> {
    private K key;
    private V value;
    public MyMap<K,V> next;

    public MyMap(K key, V value, MyMap<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

}

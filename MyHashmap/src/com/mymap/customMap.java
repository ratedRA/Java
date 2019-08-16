package com.mymap;

public interface customMap<K,V> {
    boolean put(K key, V value);
    V get(K key);
    boolean containsKey(K key);
    int size();
    boolean remove(K key);
}

package com.mymap;

public class MyHashMap<K, V> implements customMap<K,V>{
    private MyMap<K,V>[] contentTable;
    private int defaultSize;

    public MyHashMap(int defaultSize) {
        this.defaultSize = defaultSize;
        this.contentTable = new MyMap[this.defaultSize];
    }
    @Override
    public boolean put(K key, V value){
        if(key==null){
            System.out.println("Key is null");
            return false;
        }
        int hasehdValue = hashValue(key);
        MyMap<K, V> pair = new MyMap<>(key, value, null);
        if(contentTable[hasehdValue]==null){
            contentTable[hasehdValue] = pair;
            return true;
        }
        else{
            MyMap<K,V> prev = null;
            MyMap<K, V> current = pair;
            while(current!=null){
                if(current.getKey().equals(key)){
                    if(prev==null){
                        pair.next = current.next;
                        contentTable[hasehdValue] = pair;
                    } else {
                        pair.next = current.next;
                        prev.next = pair;
                    }
                }
                prev = current;
                current = current.next;
            }
            prev.next = pair;
        }
        return true;
    }
    @Override
    public V get(K key){
        if(key==null){
            return null;
        }
        int hashedValue = hashValue(key);
        if(contentTable[hashedValue]==null){
            return  null;
        }
        MyMap<K,V> temp = contentTable[hashedValue];
        while(temp!=null){
            if(temp.getKey().equals(key)){
                return temp.getValue();
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        if(key==null){
            return false;
        }
        int hashedValue = hashValue(key);
        if(contentTable[hashedValue]==null){
            return false;
        }
        MyMap<K,V> temp = contentTable[hashedValue];
        while(temp!=null){
            if(temp.getKey().equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public int size() {
        int count = 0;
        for(int i =0; i<contentTable.length;i++) {
            if (contentTable[i] != null) {
                for (MyMap<K, V> m = contentTable[i]; m.next != null; m = m.next) {
                    count += 1;
                }
                count += 1;
            }
        }
        return count;
    }
    public boolean remove(K key) {
        if (key == null) {
            return false;
        }
        int hashValue = hashValue(key);
        if (contentTable[hashValue] == null) {
            return false;
        } else {
            MyMap<K, V> previous = null;
            MyMap<K, V> current = contentTable[hashValue];
            while (current != null) {
                if (current.getKey().equals(key)) {
                    if (previous == null) {
                        contentTable[hashValue] = contentTable[hashValue].next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }
                }
                previous = current;
                current = current.next;
            }
            return false;
        }
    }

    private int hashValue(K key){
        return Math.abs(key.hashCode())%defaultSize;
    }
}

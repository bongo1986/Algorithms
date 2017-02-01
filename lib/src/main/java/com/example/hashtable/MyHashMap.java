package com.example.hashtable;

/**
 * Created by Greg on 01-02-2017.
 */
public class MyHashMap {
    private final static int SIZE = 180;
    private HashEntry[] values;

    public MyHashMap(){
        values = new HashEntry[SIZE];
        for(int i = 0; i < values.length; i++){
            values[i] = null;
        }

    }
    /*public int get(int key){
        int hash = key % SIZE;

        while(values[hash] != null && values[hash].getKey() != key){

        }
    }*/

    public void put(int value, int key){

        int hash = key % SIZE;
        while (values[hash] != null || values[hash].getKey() != key ) {
            hash =  (hash + 1) % SIZE;
        }
        values[hash] = new HashEntry(key, value);
    }

}

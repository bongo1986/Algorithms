package com.example.hashtable;

/**
 * Created by Greg on 01-02-2017.
 */
public class HashEntry {
    private int value;
    private int key;

    public HashEntry(int key, int value){
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }


    public int getValue() {
        return value;
    }

}

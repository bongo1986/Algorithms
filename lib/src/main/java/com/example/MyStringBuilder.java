package com.example;

import java.util.ArrayList;

import jdk.nashorn.internal.ir.LiteralNode;

/**
 * Created by Greg on 01-02-2017.
 */
public class MyStringBuilder {
    private ArrayList<Character> lst;

    public MyStringBuilder(){
        lst = new ArrayList<Character>();
    }

    public void Add(String str){
        for(int i = 0; i < str.length(); i++){
            lst.add(str.charAt(i));
        }
    }
    @Override
    public String toString(){
        char[] out = new char[lst.size()];

        for(int i = 0; i < lst.size(); i++){
            out[i] = (char)lst.get(i);
        }
        return new String(out);
    }
}

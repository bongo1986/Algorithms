package com.example;

public class MainClass {
    public static void main(String[] args) {
        MyStringBuilder strBuilder = new MyStringBuilder();

        strBuilder.Add("test str");
        strBuilder.Add("test str2");
        strBuilder.Add("test str3");
        // Prints "Hello, World" to the terminal window.
        System.out.println(strBuilder.toString());
    }
}

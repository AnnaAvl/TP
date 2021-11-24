package com.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! How are you?");
        int a = 0;
        for (int i = 0; i <= 10; i++) {
            a += i;
            System.out.println(a << 2);
        }
        System.out.println(a);
        System.out.println("Hello, it's ok");
    }
}

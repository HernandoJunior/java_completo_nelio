package org.java.basicTopics;

public class Bitwise {
    public static void main(String[] args) {
        int a, b;
        a = 42;

        b = --a;
        System.out.println("B with prefix operator --: " + b + " A: " + a);

        b = a--;
        System.out.println("B with posfix operator --: " + b + " A: " + a);


    }
}

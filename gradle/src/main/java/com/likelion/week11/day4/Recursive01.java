package com.likelion.week11.day4;

public class Recursive01 {
    public static void main(String[] args) {
        recur(3);
    }

    private static void recur(int n) {
        if(n <= 0) return;
        recur(n - 1);
        System.out.println(n);
        recur(n-2);
    }
}
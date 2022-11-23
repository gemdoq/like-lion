package com.likelion.week11.day2;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.printf("%d%n", factorial.calc(5));
    }

    public int calc(int num) {
        if (num == 1) return num;
        return num * calc(num-1);
    }
}
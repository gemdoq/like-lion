package com.likelion.week11.day4;

public class EuclideanGCD01 {
    public static void main(String[] args) {
        int a =1071;
        int b = 1029;

        int result = EuclideanGCD01.gcd(a, b);
        System.out.printf("%d%n", result);
    }

    private static int gcd(int a, int b) {
        if(a == b) return a;
        if(a > b) return gcd(b, a);
        return gcd(a, b - a);
    }
}
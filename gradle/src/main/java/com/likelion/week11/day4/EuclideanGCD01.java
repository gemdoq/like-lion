package com.likelion.week11.day4;

public class EuclideanGCD01 {
    public static void main(String[] args) {
        int a =1071;
        int b = 1029;

        int result = EuclideanGCD01.recursiveGcd(a, b);
        System.out.printf("%d%n", result);

        int result2 = EuclideanGCD01.whileGcd(a, b);
        System.out.printf("%d%n", result2);
    }

    private static int recursiveGcd(int a, int b) {
        if(a == b) return a;
        if(a > b) return recursiveGcd(b, a);
        return recursiveGcd(a, b - a);
    }

    private static int whileGcd(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
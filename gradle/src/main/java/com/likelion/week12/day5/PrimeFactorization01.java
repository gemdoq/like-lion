package com.likelion.week12.day5;

public class PrimeFactorization01 {
    public static void main(String[] args) {
        int n = 72;
        PrimeFactorization01.findPrimeFactor(n);
    }

    static void findPrimeFactor(int n) {
        for(int i=2; i * i <= n; i++) {
            while ( n % i == 0 ) {
                System.out.printf("%d ", i);
                n /= i;
            }
        }
        if (n != 1) System.out.printf("%d", n);
    }
}
package com.likelion.week12.day3;

public class RecursiveBinary01 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int result = findLca(a, b);
        System.out.printf("%d%n", result);
    }

    private static int findLca(int a, int b) {
        if(a > b) return findLca(a/2, b) + 1;
        if(a < b) return findLca(a, b/2) + 1;
        return 0;
    }
}
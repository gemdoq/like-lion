package com.likelion.week11.day2;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        int index = 10;
        int result = recursiveFibonacci.calc(10);
        System.out.printf("%d", result);
    }

    public int calc(int index) {
        if (index <= 2) return 1;
        return calc(index - 1) + calc(index - 2);
    }
}

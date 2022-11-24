package com.likelion.week11.day3;

public class RecursiveFibonacci02 {
    public static void main(String[] args) {

        int index = 10;

        RecursiveFibonacci02 recursiveFibonacci02 = new RecursiveFibonacci02();

        int result = recursiveFibonacci02.calc(index);

        System.out.printf("%d %n", result);
    }

    public int calc(int index) {
        /*
        index : 1 -> result : 1
        index : 2 -> result : 1
        index : 3 -> result : 2 = index(1) + index(2)
        index : 4 -> result : 3 = index(2) + index(3)
        index : 5 -> result : 5 = index(3) + index(4)
        index : 6 -> result : 8 = index(4) + index(5)
        index : n -> result : index(n-2) + index(n-1)
         */
        return 0;
    }
}
package com.likelion.week11.day2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int index = 10;
        int result = fibonacci.calc(index);
        System.out.printf("%d\n", result);
    }

    public int calc(int index) {
        if(index == 1 || index == 2) return 1;

        List<Integer> fibonacciNums = new ArrayList<Integer>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for (int i = 2; i < index; i++) {
            fibonacciNums.add(fibonacciNums.get(i-1)+fibonacciNums.get(i-2));
        }
        return fibonacciNums.get(index-1);
    }
}
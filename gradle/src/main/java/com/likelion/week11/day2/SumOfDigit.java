package com.likelion.week11.day2;

public class SumOfDigit {
    public static void main(String[] args) {
        SumOfDigit sumOfDigit = new SumOfDigit();
        System.out.printf("%d", sumOfDigit.sum(12345));
    }

    public int sum(int num) {
        if(num == 0) return 0;
        return num%10 + sum(num/10);
    }
}
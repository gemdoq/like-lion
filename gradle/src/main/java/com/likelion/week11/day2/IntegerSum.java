package com.likelion.week11.day2;

public class IntegerSum {
    public static void main(String[] args) {
        IntegerSum integerSum = new IntegerSum();
        System.out.printf("%d", integerSum.sum(5));
    }

    public Integer sum(int num) {
        if(num == 0) return num;
        return num + sum(num - 1);
    }
}
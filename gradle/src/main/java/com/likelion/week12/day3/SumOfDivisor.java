package com.likelion.week12.day3;

public class SumOfDivisor {
    public static void main(String[] args) {
        int num = 12;
        System.out.printf("%d%n", SumOfDivisor.sum(num));
    }

    private static int sum(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if (Math.floorMod(num, i) == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
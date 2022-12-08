package com.likelion.week13.day4;

public class FiboDp01 {
    private static long fib(int n, long[] memo) {
        if(n == 0) throw new IllegalArgumentException("n은 1 이상이어야 합니다.");
        if(n<=2) return 1;

        if(memo[n] == 0) {
            int left = (int) fib(n-1, memo);
            int right = (int) fib(n-2, memo);
            memo[n] =  left + right;
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 6;
        var r = fib(n, new long[n + 1]);
        System.out.println(r);
    }
}

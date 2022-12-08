package com.likelion.week13.day4;

public class FiboDp02 {

    private int[] memo;

    public FiboDp02(int n) {
        this.memo = new int[n + 1];
        this.memo[1] = 1;
        this.memo[2] = 1;
    }

    public int fib(int n) {
        if(n == 0) throw new IllegalArgumentException("n은 1 이상이어야 합니다.");
        for (int i = 1; i <= n; i++) {
            if(this.memo[i] == 0){
                memo[i] = memo[i - 1] + memo[i - 2];
            }
        }
        return memo[n];
    }
    public static void main(String[] args) {
        FiboDp02 fiboDp02 = new FiboDp02(5);
        var r = fiboDp02.fib(5);
        System.out.println(r);
    }
}

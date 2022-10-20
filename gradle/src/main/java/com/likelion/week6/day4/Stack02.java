package com.likelion.week6.day4;

public class Stack02 {
    private Integer[] arr;
    private int top = 0;
    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10 넣으면 arr[0] = 10
        this.arr[top] = value;
        this.top++;
    }

    public int pop() {
        int value = this.arr[this.top-1];
        this.top--;
        return value;
    }
}

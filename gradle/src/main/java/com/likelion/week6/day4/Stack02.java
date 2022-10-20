package com.likelion.week6.day4;

import java.util.EmptyStackException;

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
        this.arr[top++] = value;
    }

    public int pop() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[--this.top];
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }

    public Integer peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top-1];
    }
}
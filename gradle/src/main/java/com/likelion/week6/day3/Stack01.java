package com.likelion.week6.day3;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        // 10 arr[0]
        // 29 arr[1]
        this.arr[this.pointer] = value;
        this.pointer ++;
    }

    public int[] getArr() {
        return arr;
    }

}
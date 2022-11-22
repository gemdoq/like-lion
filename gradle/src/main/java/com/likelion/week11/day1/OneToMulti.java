package com.likelion.week11.day1;

public class OneToMulti {
    public static void printOneToMulti(int start, int end) {
        if(start > end) return;
        System.out.println(start);
        printOneToMulti(start+1, end);
    }

    public static void main(String[] args) {
        OneToMulti.printOneToMulti(1, 100);
    }
}
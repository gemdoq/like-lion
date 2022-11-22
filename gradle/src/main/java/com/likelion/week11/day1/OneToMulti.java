package com.likelion.week11.day1;

public class OneToMulti {
    public static void printOneToMulti(int start) {
        System.out.println(start);
        printOneToMulti(start);
    }

    public static void main(String[] args) {
        OneToMulti.printOneToMulti(1);
    }
}

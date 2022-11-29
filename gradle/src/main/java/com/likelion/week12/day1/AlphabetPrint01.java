package com.likelion.week12.day1;

public class AlphabetPrint01 {
    public static void main(String[] args) {
        char start = 'A';
        char end = 'Z';
        AlphabetPrint01.print(start, end);
    }

    private static void print(char start, char end) {
        for(char c = start; c <= end; c++) {
            System.out.println(c);
        }
    }
}
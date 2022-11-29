package com.likelion.week12.day1;

public class AlphabetPrint02 {
    public static void main(String[] args) {
        char start = 'A';
        char end = 'Z';
        AlphabetPrint02.print(start, end);
    }

    private static void print(char start, char end) {
        for(char c = start; c <= end; c++) {
            for(char c2 = start; c2 <= end; c2++) {
                System.out.printf("%s%s%n", c, c2);
            }
        }
    }
}
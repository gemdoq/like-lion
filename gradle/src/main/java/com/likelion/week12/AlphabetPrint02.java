package com.likelion.week12;

public class AlphabetPrint02 {
    public static void main(String[] args) {
        char start = 'A';
        char end = 'Z';
        AlphabetPrint02.print(start, end, 2);
    }

    private static void print(char start, char end, int num) {
        for(char c = start; c <= end; c++) {
            for(char c2 = start; c2 <= end; c2++) {
                System.out.printf("%s%s%n", c, c2);
            }
        }
    }
}
package com.likelion.week12.day1;

public class AlphabetPrint03 {
    public static void main(String[] args) {
        char start = 'A';
        char end = 'Z';
        AlphabetPrint03.print(start, end);
    }

    private static void print(char start, char end) {
        recursive(start, start, end);
    }

    private static void recursive(char start, char start2, char end) {
        if(start > end) return;
        if(start2 >= end) {
            System.out.printf("%s%s%n", start, start2);
            start2 = 'A';
            recursive((char)(start+1), start2, end);
            return;
        }
        System.out.printf("%s%s%n", start, start2);
        recursive(start, (char) (start2+1), end);
    }
}
package com.likelion.week12;

public class AlphabetPrint01 {
    public static void main(String[] args) {
        AlphabetPrint01.print("A", "Z", 2);
    }

    private static void print(char start, char end, int num) {
        for(char c = start; c <= end; c++) {
            System.out.println(c);
        }
    }
}
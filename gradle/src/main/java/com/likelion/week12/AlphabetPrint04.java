package com.likelion.week12;

public class AlphabetPrint04 {
    public static void main(String[] args) {
        printAlphabet("");
    }

    public static void printAlphabet(String prefix) {
        if (prefix.length() > 3) return;
        System.out.println(prefix);

        for (char c = 'A'; c <= 'Z'; c++) {
            printAlphabet(prefix + c);
        }
    }
}
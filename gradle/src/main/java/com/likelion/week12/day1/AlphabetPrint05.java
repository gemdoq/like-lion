package com.likelion.week12.day1;

public class AlphabetPrint05 {
    public static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void printAlphabet(String prefix, int depth) {
        if (prefix.length() > depth) return;
        System.out.println(prefix);

        for (int i = 0; i < chars.length(); i++) {
            printAlphabet(prefix + chars.charAt(i), depth);
        }
    }

    public static void main(String[] args) {
        printAlphabet("", 2);
    }
}
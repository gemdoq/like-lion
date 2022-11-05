package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int asciiNumOfInput = (int)input.charAt(0);
        char nextChar = (char) (asciiNumOfInput+1);
        System.out.printf("%s", nextChar);
    }
}

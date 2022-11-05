package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int remainder = numA%numB;
        System.out.printf("%d", remainder);
    }
}
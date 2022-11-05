package com.likelion.codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A+B+C;
        float aver = (float)sum/3;

        System.out.printf("%d\n%.1f", sum, aver);
    }
}
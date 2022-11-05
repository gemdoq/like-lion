package com.likelion.week8.codeup;

import java.util.Scanner;

public class CodeUp1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        float shareNum = (float) (numA / numB);
        System.out.printf("%d", (int)shareNum);
    }
}